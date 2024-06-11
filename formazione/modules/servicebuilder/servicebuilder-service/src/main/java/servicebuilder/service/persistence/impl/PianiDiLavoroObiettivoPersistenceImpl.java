/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package servicebuilder.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import servicebuilder.exception.NoSuchPianiDiLavoroObiettivoException;

import servicebuilder.model.PianiDiLavoroObiettivo;
import servicebuilder.model.PianiDiLavoroObiettivoTable;
import servicebuilder.model.impl.PianiDiLavoroObiettivoImpl;
import servicebuilder.model.impl.PianiDiLavoroObiettivoModelImpl;

import servicebuilder.service.persistence.PianiDiLavoroObiettivoPersistence;
import servicebuilder.service.persistence.PianiDiLavoroObiettivoUtil;
import servicebuilder.service.persistence.impl.constants.AQPersistenceConstants;

/**
 * The persistence implementation for the piani di lavoro obiettivo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {PianiDiLavoroObiettivoPersistence.class, BasePersistence.class}
)
public class PianiDiLavoroObiettivoPersistenceImpl
	extends BasePersistenceImpl<PianiDiLavoroObiettivo>
	implements PianiDiLavoroObiettivoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PianiDiLavoroObiettivoUtil</code> to access the piani di lavoro obiettivo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PianiDiLavoroObiettivoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByProgettiFabbisogni;
	private FinderPath _finderPathWithoutPaginationFindByProgettiFabbisogni;
	private FinderPath _finderPathCountByProgettiFabbisogni;

	/**
	 * Returns all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @return the matching piani di lavoro obiettivos
	 */
	@Override
	public List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni) {

		return findByProgettiFabbisogni(
			FK_progettiFabbisogni, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @return the range of matching piani di lavoro obiettivos
	 */
	@Override
	public List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni, int start, int end) {

		return findByProgettiFabbisogni(
			FK_progettiFabbisogni, start, end, null);
	}

	/**
	 * Returns an ordered range of all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching piani di lavoro obiettivos
	 */
	@Override
	public List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni, int start, int end,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator) {

		return findByProgettiFabbisogni(
			FK_progettiFabbisogni, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching piani di lavoro obiettivos
	 */
	@Override
	public List<PianiDiLavoroObiettivo> findByProgettiFabbisogni(
		long FK_progettiFabbisogni, int start, int end,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByProgettiFabbisogni;
				finderArgs = new Object[] {FK_progettiFabbisogni};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByProgettiFabbisogni;
			finderArgs = new Object[] {
				FK_progettiFabbisogni, start, end, orderByComparator
			};
		}

		List<PianiDiLavoroObiettivo> list = null;

		if (useFinderCache) {
			list = (List<PianiDiLavoroObiettivo>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (PianiDiLavoroObiettivo pianiDiLavoroObiettivo : list) {
					if (FK_progettiFabbisogni !=
							pianiDiLavoroObiettivo.getFK_progettiFabbisogni()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PIANIDILAVOROOBIETTIVO_WHERE);

			sb.append(
				_FINDER_COLUMN_PROGETTIFABBISOGNI_FK_PROGETTIFABBISOGNI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PianiDiLavoroObiettivoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(FK_progettiFabbisogni);

				list = (List<PianiDiLavoroObiettivo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a matching piani di lavoro obiettivo could not be found
	 */
	@Override
	public PianiDiLavoroObiettivo findByProgettiFabbisogni_First(
			long FK_progettiFabbisogni,
			OrderByComparator<PianiDiLavoroObiettivo> orderByComparator)
		throws NoSuchPianiDiLavoroObiettivoException {

		PianiDiLavoroObiettivo pianiDiLavoroObiettivo =
			fetchByProgettiFabbisogni_First(
				FK_progettiFabbisogni, orderByComparator);

		if (pianiDiLavoroObiettivo != null) {
			return pianiDiLavoroObiettivo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("FK_progettiFabbisogni=");
		sb.append(FK_progettiFabbisogni);

		sb.append("}");

		throw new NoSuchPianiDiLavoroObiettivoException(sb.toString());
	}

	/**
	 * Returns the first piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching piani di lavoro obiettivo, or <code>null</code> if a matching piani di lavoro obiettivo could not be found
	 */
	@Override
	public PianiDiLavoroObiettivo fetchByProgettiFabbisogni_First(
		long FK_progettiFabbisogni,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator) {

		List<PianiDiLavoroObiettivo> list = findByProgettiFabbisogni(
			FK_progettiFabbisogni, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a matching piani di lavoro obiettivo could not be found
	 */
	@Override
	public PianiDiLavoroObiettivo findByProgettiFabbisogni_Last(
			long FK_progettiFabbisogni,
			OrderByComparator<PianiDiLavoroObiettivo> orderByComparator)
		throws NoSuchPianiDiLavoroObiettivoException {

		PianiDiLavoroObiettivo pianiDiLavoroObiettivo =
			fetchByProgettiFabbisogni_Last(
				FK_progettiFabbisogni, orderByComparator);

		if (pianiDiLavoroObiettivo != null) {
			return pianiDiLavoroObiettivo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("FK_progettiFabbisogni=");
		sb.append(FK_progettiFabbisogni);

		sb.append("}");

		throw new NoSuchPianiDiLavoroObiettivoException(sb.toString());
	}

	/**
	 * Returns the last piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching piani di lavoro obiettivo, or <code>null</code> if a matching piani di lavoro obiettivo could not be found
	 */
	@Override
	public PianiDiLavoroObiettivo fetchByProgettiFabbisogni_Last(
		long FK_progettiFabbisogni,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator) {

		int count = countByProgettiFabbisogni(FK_progettiFabbisogni);

		if (count == 0) {
			return null;
		}

		List<PianiDiLavoroObiettivo> list = findByProgettiFabbisogni(
			FK_progettiFabbisogni, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the piani di lavoro obiettivos before and after the current piani di lavoro obiettivo in the ordered set where FK_progettiFabbisogni = &#63;.
	 *
	 * @param Id_PianoDiLavoro the primary key of the current piani di lavoro obiettivo
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	@Override
	public PianiDiLavoroObiettivo[] findByProgettiFabbisogni_PrevAndNext(
			long Id_PianoDiLavoro, long FK_progettiFabbisogni,
			OrderByComparator<PianiDiLavoroObiettivo> orderByComparator)
		throws NoSuchPianiDiLavoroObiettivoException {

		PianiDiLavoroObiettivo pianiDiLavoroObiettivo = findByPrimaryKey(
			Id_PianoDiLavoro);

		Session session = null;

		try {
			session = openSession();

			PianiDiLavoroObiettivo[] array = new PianiDiLavoroObiettivoImpl[3];

			array[0] = getByProgettiFabbisogni_PrevAndNext(
				session, pianiDiLavoroObiettivo, FK_progettiFabbisogni,
				orderByComparator, true);

			array[1] = pianiDiLavoroObiettivo;

			array[2] = getByProgettiFabbisogni_PrevAndNext(
				session, pianiDiLavoroObiettivo, FK_progettiFabbisogni,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PianiDiLavoroObiettivo getByProgettiFabbisogni_PrevAndNext(
		Session session, PianiDiLavoroObiettivo pianiDiLavoroObiettivo,
		long FK_progettiFabbisogni,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PIANIDILAVOROOBIETTIVO_WHERE);

		sb.append(_FINDER_COLUMN_PROGETTIFABBISOGNI_FK_PROGETTIFABBISOGNI_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PianiDiLavoroObiettivoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(FK_progettiFabbisogni);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						pianiDiLavoroObiettivo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PianiDiLavoroObiettivo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the piani di lavoro obiettivos where FK_progettiFabbisogni = &#63; from the database.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 */
	@Override
	public void removeByProgettiFabbisogni(long FK_progettiFabbisogni) {
		for (PianiDiLavoroObiettivo pianiDiLavoroObiettivo :
				findByProgettiFabbisogni(
					FK_progettiFabbisogni, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(pianiDiLavoroObiettivo);
		}
	}

	/**
	 * Returns the number of piani di lavoro obiettivos where FK_progettiFabbisogni = &#63;.
	 *
	 * @param FK_progettiFabbisogni the fk_progetti fabbisogni
	 * @return the number of matching piani di lavoro obiettivos
	 */
	@Override
	public int countByProgettiFabbisogni(long FK_progettiFabbisogni) {
		FinderPath finderPath = _finderPathCountByProgettiFabbisogni;

		Object[] finderArgs = new Object[] {FK_progettiFabbisogni};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PIANIDILAVOROOBIETTIVO_WHERE);

			sb.append(
				_FINDER_COLUMN_PROGETTIFABBISOGNI_FK_PROGETTIFABBISOGNI_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(FK_progettiFabbisogni);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_PROGETTIFABBISOGNI_FK_PROGETTIFABBISOGNI_2 =
			"pianiDiLavoroObiettivo.FK_progettiFabbisogni = ?";

	public PianiDiLavoroObiettivoPersistenceImpl() {
		setModelClass(PianiDiLavoroObiettivo.class);

		setModelImplClass(PianiDiLavoroObiettivoImpl.class);
		setModelPKClass(long.class);

		setTable(PianiDiLavoroObiettivoTable.INSTANCE);
	}

	/**
	 * Caches the piani di lavoro obiettivo in the entity cache if it is enabled.
	 *
	 * @param pianiDiLavoroObiettivo the piani di lavoro obiettivo
	 */
	@Override
	public void cacheResult(PianiDiLavoroObiettivo pianiDiLavoroObiettivo) {
		entityCache.putResult(
			PianiDiLavoroObiettivoImpl.class,
			pianiDiLavoroObiettivo.getPrimaryKey(), pianiDiLavoroObiettivo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the piani di lavoro obiettivos in the entity cache if it is enabled.
	 *
	 * @param pianiDiLavoroObiettivos the piani di lavoro obiettivos
	 */
	@Override
	public void cacheResult(
		List<PianiDiLavoroObiettivo> pianiDiLavoroObiettivos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pianiDiLavoroObiettivos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PianiDiLavoroObiettivo pianiDiLavoroObiettivo :
				pianiDiLavoroObiettivos) {

			if (entityCache.getResult(
					PianiDiLavoroObiettivoImpl.class,
					pianiDiLavoroObiettivo.getPrimaryKey()) == null) {

				cacheResult(pianiDiLavoroObiettivo);
			}
		}
	}

	/**
	 * Clears the cache for all piani di lavoro obiettivos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PianiDiLavoroObiettivoImpl.class);

		finderCache.clearCache(PianiDiLavoroObiettivoImpl.class);
	}

	/**
	 * Clears the cache for the piani di lavoro obiettivo.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PianiDiLavoroObiettivo pianiDiLavoroObiettivo) {
		entityCache.removeResult(
			PianiDiLavoroObiettivoImpl.class, pianiDiLavoroObiettivo);
	}

	@Override
	public void clearCache(
		List<PianiDiLavoroObiettivo> pianiDiLavoroObiettivos) {

		for (PianiDiLavoroObiettivo pianiDiLavoroObiettivo :
				pianiDiLavoroObiettivos) {

			entityCache.removeResult(
				PianiDiLavoroObiettivoImpl.class, pianiDiLavoroObiettivo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PianiDiLavoroObiettivoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PianiDiLavoroObiettivoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new piani di lavoro obiettivo with the primary key. Does not add the piani di lavoro obiettivo to the database.
	 *
	 * @param Id_PianoDiLavoro the primary key for the new piani di lavoro obiettivo
	 * @return the new piani di lavoro obiettivo
	 */
	@Override
	public PianiDiLavoroObiettivo create(long Id_PianoDiLavoro) {
		PianiDiLavoroObiettivo pianiDiLavoroObiettivo =
			new PianiDiLavoroObiettivoImpl();

		pianiDiLavoroObiettivo.setNew(true);
		pianiDiLavoroObiettivo.setPrimaryKey(Id_PianoDiLavoro);

		return pianiDiLavoroObiettivo;
	}

	/**
	 * Removes the piani di lavoro obiettivo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_PianoDiLavoro the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo that was removed
	 * @throws NoSuchPianiDiLavoroObiettivoException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	@Override
	public PianiDiLavoroObiettivo remove(long Id_PianoDiLavoro)
		throws NoSuchPianiDiLavoroObiettivoException {

		return remove((Serializable)Id_PianoDiLavoro);
	}

	/**
	 * Removes the piani di lavoro obiettivo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo that was removed
	 * @throws NoSuchPianiDiLavoroObiettivoException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	@Override
	public PianiDiLavoroObiettivo remove(Serializable primaryKey)
		throws NoSuchPianiDiLavoroObiettivoException {

		Session session = null;

		try {
			session = openSession();

			PianiDiLavoroObiettivo pianiDiLavoroObiettivo =
				(PianiDiLavoroObiettivo)session.get(
					PianiDiLavoroObiettivoImpl.class, primaryKey);

			if (pianiDiLavoroObiettivo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPianiDiLavoroObiettivoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pianiDiLavoroObiettivo);
		}
		catch (NoSuchPianiDiLavoroObiettivoException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected PianiDiLavoroObiettivo removeImpl(
		PianiDiLavoroObiettivo pianiDiLavoroObiettivo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pianiDiLavoroObiettivo)) {
				pianiDiLavoroObiettivo = (PianiDiLavoroObiettivo)session.get(
					PianiDiLavoroObiettivoImpl.class,
					pianiDiLavoroObiettivo.getPrimaryKeyObj());
			}

			if (pianiDiLavoroObiettivo != null) {
				session.delete(pianiDiLavoroObiettivo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pianiDiLavoroObiettivo != null) {
			clearCache(pianiDiLavoroObiettivo);
		}

		return pianiDiLavoroObiettivo;
	}

	@Override
	public PianiDiLavoroObiettivo updateImpl(
		PianiDiLavoroObiettivo pianiDiLavoroObiettivo) {

		boolean isNew = pianiDiLavoroObiettivo.isNew();

		if (!(pianiDiLavoroObiettivo instanceof
				PianiDiLavoroObiettivoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pianiDiLavoroObiettivo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pianiDiLavoroObiettivo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pianiDiLavoroObiettivo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PianiDiLavoroObiettivo implementation " +
					pianiDiLavoroObiettivo.getClass());
		}

		PianiDiLavoroObiettivoModelImpl pianiDiLavoroObiettivoModelImpl =
			(PianiDiLavoroObiettivoModelImpl)pianiDiLavoroObiettivo;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pianiDiLavoroObiettivo);
			}
			else {
				pianiDiLavoroObiettivo = (PianiDiLavoroObiettivo)session.merge(
					pianiDiLavoroObiettivo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PianiDiLavoroObiettivoImpl.class, pianiDiLavoroObiettivoModelImpl,
			false, true);

		if (isNew) {
			pianiDiLavoroObiettivo.setNew(false);
		}

		pianiDiLavoroObiettivo.resetOriginalValues();

		return pianiDiLavoroObiettivo;
	}

	/**
	 * Returns the piani di lavoro obiettivo with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	@Override
	public PianiDiLavoroObiettivo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPianiDiLavoroObiettivoException {

		PianiDiLavoroObiettivo pianiDiLavoroObiettivo = fetchByPrimaryKey(
			primaryKey);

		if (pianiDiLavoroObiettivo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPianiDiLavoroObiettivoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pianiDiLavoroObiettivo;
	}

	/**
	 * Returns the piani di lavoro obiettivo with the primary key or throws a <code>NoSuchPianiDiLavoroObiettivoException</code> if it could not be found.
	 *
	 * @param Id_PianoDiLavoro the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo
	 * @throws NoSuchPianiDiLavoroObiettivoException if a piani di lavoro obiettivo with the primary key could not be found
	 */
	@Override
	public PianiDiLavoroObiettivo findByPrimaryKey(long Id_PianoDiLavoro)
		throws NoSuchPianiDiLavoroObiettivoException {

		return findByPrimaryKey((Serializable)Id_PianoDiLavoro);
	}

	/**
	 * Returns the piani di lavoro obiettivo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_PianoDiLavoro the primary key of the piani di lavoro obiettivo
	 * @return the piani di lavoro obiettivo, or <code>null</code> if a piani di lavoro obiettivo with the primary key could not be found
	 */
	@Override
	public PianiDiLavoroObiettivo fetchByPrimaryKey(long Id_PianoDiLavoro) {
		return fetchByPrimaryKey((Serializable)Id_PianoDiLavoro);
	}

	/**
	 * Returns all the piani di lavoro obiettivos.
	 *
	 * @return the piani di lavoro obiettivos
	 */
	@Override
	public List<PianiDiLavoroObiettivo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the piani di lavoro obiettivos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @return the range of piani di lavoro obiettivos
	 */
	@Override
	public List<PianiDiLavoroObiettivo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the piani di lavoro obiettivos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of piani di lavoro obiettivos
	 */
	@Override
	public List<PianiDiLavoroObiettivo> findAll(
		int start, int end,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the piani di lavoro obiettivos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PianiDiLavoroObiettivoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of piani di lavoro obiettivos
	 * @param end the upper bound of the range of piani di lavoro obiettivos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of piani di lavoro obiettivos
	 */
	@Override
	public List<PianiDiLavoroObiettivo> findAll(
		int start, int end,
		OrderByComparator<PianiDiLavoroObiettivo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<PianiDiLavoroObiettivo> list = null;

		if (useFinderCache) {
			list = (List<PianiDiLavoroObiettivo>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PIANIDILAVOROOBIETTIVO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PIANIDILAVOROOBIETTIVO;

				sql = sql.concat(PianiDiLavoroObiettivoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PianiDiLavoroObiettivo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the piani di lavoro obiettivos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PianiDiLavoroObiettivo pianiDiLavoroObiettivo : findAll()) {
			remove(pianiDiLavoroObiettivo);
		}
	}

	/**
	 * Returns the number of piani di lavoro obiettivos.
	 *
	 * @return the number of piani di lavoro obiettivos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_PIANIDILAVOROOBIETTIVO);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "Id_PianoDiLavoro";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PIANIDILAVOROOBIETTIVO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PianiDiLavoroObiettivoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the piani di lavoro obiettivo persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByProgettiFabbisogni = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProgettiFabbisogni",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"FK_progettiFabbisogni"}, true);

		_finderPathWithoutPaginationFindByProgettiFabbisogni = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByProgettiFabbisogni", new String[] {Long.class.getName()},
			new String[] {"FK_progettiFabbisogni"}, true);

		_finderPathCountByProgettiFabbisogni = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByProgettiFabbisogni", new String[] {Long.class.getName()},
			new String[] {"FK_progettiFabbisogni"}, false);

		_setPianiDiLavoroObiettivoUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setPianiDiLavoroObiettivoUtilPersistence(null);

		entityCache.removeCache(PianiDiLavoroObiettivoImpl.class.getName());
	}

	private void _setPianiDiLavoroObiettivoUtilPersistence(
		PianiDiLavoroObiettivoPersistence pianiDiLavoroObiettivoPersistence) {

		try {
			Field field = PianiDiLavoroObiettivoUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, pianiDiLavoroObiettivoPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = AQPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = AQPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = AQPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PIANIDILAVOROOBIETTIVO =
		"SELECT pianiDiLavoroObiettivo FROM PianiDiLavoroObiettivo pianiDiLavoroObiettivo";

	private static final String _SQL_SELECT_PIANIDILAVOROOBIETTIVO_WHERE =
		"SELECT pianiDiLavoroObiettivo FROM PianiDiLavoroObiettivo pianiDiLavoroObiettivo WHERE ";

	private static final String _SQL_COUNT_PIANIDILAVOROOBIETTIVO =
		"SELECT COUNT(pianiDiLavoroObiettivo) FROM PianiDiLavoroObiettivo pianiDiLavoroObiettivo";

	private static final String _SQL_COUNT_PIANIDILAVOROOBIETTIVO_WHERE =
		"SELECT COUNT(pianiDiLavoroObiettivo) FROM PianiDiLavoroObiettivo pianiDiLavoroObiettivo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pianiDiLavoroObiettivo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PianiDiLavoroObiettivo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PianiDiLavoroObiettivo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PianiDiLavoroObiettivoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PianiDiLavoroObiettivoModelArgumentsResolver
		_pianiDiLavoroObiettivoModelArgumentsResolver;

}