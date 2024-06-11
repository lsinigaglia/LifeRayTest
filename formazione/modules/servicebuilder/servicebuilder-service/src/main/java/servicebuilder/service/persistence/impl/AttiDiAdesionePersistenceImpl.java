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

import servicebuilder.exception.NoSuchAttiDiAdesioneException;

import servicebuilder.model.AttiDiAdesione;
import servicebuilder.model.AttiDiAdesioneTable;
import servicebuilder.model.impl.AttiDiAdesioneImpl;
import servicebuilder.model.impl.AttiDiAdesioneModelImpl;

import servicebuilder.service.persistence.AttiDiAdesionePersistence;
import servicebuilder.service.persistence.AttiDiAdesioneUtil;
import servicebuilder.service.persistence.impl.constants.AQPersistenceConstants;

/**
 * The persistence implementation for the atti di adesione service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {AttiDiAdesionePersistence.class, BasePersistence.class})
public class AttiDiAdesionePersistenceImpl
	extends BasePersistenceImpl<AttiDiAdesione>
	implements AttiDiAdesionePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttiDiAdesioneUtil</code> to access the atti di adesione persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttiDiAdesioneImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByAccordoQuadro;
	private FinderPath _finderPathWithoutPaginationFindByAccordoQuadro;
	private FinderPath _finderPathCountByAccordoQuadro;

	/**
	 * Returns all the atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @return the matching atti di adesiones
	 */
	@Override
	public List<AttiDiAdesione> findByAccordoQuadro(long FK_accordoQuadro) {
		return findByAccordoQuadro(
			FK_accordoQuadro, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @return the range of matching atti di adesiones
	 */
	@Override
	public List<AttiDiAdesione> findByAccordoQuadro(
		long FK_accordoQuadro, int start, int end) {

		return findByAccordoQuadro(FK_accordoQuadro, start, end, null);
	}

	/**
	 * Returns an ordered range of all the atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching atti di adesiones
	 */
	@Override
	public List<AttiDiAdesione> findByAccordoQuadro(
		long FK_accordoQuadro, int start, int end,
		OrderByComparator<AttiDiAdesione> orderByComparator) {

		return findByAccordoQuadro(
			FK_accordoQuadro, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching atti di adesiones
	 */
	@Override
	public List<AttiDiAdesione> findByAccordoQuadro(
		long FK_accordoQuadro, int start, int end,
		OrderByComparator<AttiDiAdesione> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByAccordoQuadro;
				finderArgs = new Object[] {FK_accordoQuadro};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByAccordoQuadro;
			finderArgs = new Object[] {
				FK_accordoQuadro, start, end, orderByComparator
			};
		}

		List<AttiDiAdesione> list = null;

		if (useFinderCache) {
			list = (List<AttiDiAdesione>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (AttiDiAdesione attiDiAdesione : list) {
					if (FK_accordoQuadro !=
							attiDiAdesione.getFK_accordoQuadro()) {

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

			sb.append(_SQL_SELECT_ATTIDIADESIONE_WHERE);

			sb.append(_FINDER_COLUMN_ACCORDOQUADRO_FK_ACCORDOQUADRO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AttiDiAdesioneModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(FK_accordoQuadro);

				list = (List<AttiDiAdesione>)QueryUtil.list(
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
	 * Returns the first atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a matching atti di adesione could not be found
	 */
	@Override
	public AttiDiAdesione findByAccordoQuadro_First(
			long FK_accordoQuadro,
			OrderByComparator<AttiDiAdesione> orderByComparator)
		throws NoSuchAttiDiAdesioneException {

		AttiDiAdesione attiDiAdesione = fetchByAccordoQuadro_First(
			FK_accordoQuadro, orderByComparator);

		if (attiDiAdesione != null) {
			return attiDiAdesione;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("FK_accordoQuadro=");
		sb.append(FK_accordoQuadro);

		sb.append("}");

		throw new NoSuchAttiDiAdesioneException(sb.toString());
	}

	/**
	 * Returns the first atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching atti di adesione, or <code>null</code> if a matching atti di adesione could not be found
	 */
	@Override
	public AttiDiAdesione fetchByAccordoQuadro_First(
		long FK_accordoQuadro,
		OrderByComparator<AttiDiAdesione> orderByComparator) {

		List<AttiDiAdesione> list = findByAccordoQuadro(
			FK_accordoQuadro, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a matching atti di adesione could not be found
	 */
	@Override
	public AttiDiAdesione findByAccordoQuadro_Last(
			long FK_accordoQuadro,
			OrderByComparator<AttiDiAdesione> orderByComparator)
		throws NoSuchAttiDiAdesioneException {

		AttiDiAdesione attiDiAdesione = fetchByAccordoQuadro_Last(
			FK_accordoQuadro, orderByComparator);

		if (attiDiAdesione != null) {
			return attiDiAdesione;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("FK_accordoQuadro=");
		sb.append(FK_accordoQuadro);

		sb.append("}");

		throw new NoSuchAttiDiAdesioneException(sb.toString());
	}

	/**
	 * Returns the last atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching atti di adesione, or <code>null</code> if a matching atti di adesione could not be found
	 */
	@Override
	public AttiDiAdesione fetchByAccordoQuadro_Last(
		long FK_accordoQuadro,
		OrderByComparator<AttiDiAdesione> orderByComparator) {

		int count = countByAccordoQuadro(FK_accordoQuadro);

		if (count == 0) {
			return null;
		}

		List<AttiDiAdesione> list = findByAccordoQuadro(
			FK_accordoQuadro, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the atti di adesiones before and after the current atti di adesione in the ordered set where FK_accordoQuadro = &#63;.
	 *
	 * @param Id_AttiDiAdesione the primary key of the current atti di adesione
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a atti di adesione with the primary key could not be found
	 */
	@Override
	public AttiDiAdesione[] findByAccordoQuadro_PrevAndNext(
			long Id_AttiDiAdesione, long FK_accordoQuadro,
			OrderByComparator<AttiDiAdesione> orderByComparator)
		throws NoSuchAttiDiAdesioneException {

		AttiDiAdesione attiDiAdesione = findByPrimaryKey(Id_AttiDiAdesione);

		Session session = null;

		try {
			session = openSession();

			AttiDiAdesione[] array = new AttiDiAdesioneImpl[3];

			array[0] = getByAccordoQuadro_PrevAndNext(
				session, attiDiAdesione, FK_accordoQuadro, orderByComparator,
				true);

			array[1] = attiDiAdesione;

			array[2] = getByAccordoQuadro_PrevAndNext(
				session, attiDiAdesione, FK_accordoQuadro, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AttiDiAdesione getByAccordoQuadro_PrevAndNext(
		Session session, AttiDiAdesione attiDiAdesione, long FK_accordoQuadro,
		OrderByComparator<AttiDiAdesione> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ATTIDIADESIONE_WHERE);

		sb.append(_FINDER_COLUMN_ACCORDOQUADRO_FK_ACCORDOQUADRO_2);

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
			sb.append(AttiDiAdesioneModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(FK_accordoQuadro);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						attiDiAdesione)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AttiDiAdesione> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the atti di adesiones where FK_accordoQuadro = &#63; from the database.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 */
	@Override
	public void removeByAccordoQuadro(long FK_accordoQuadro) {
		for (AttiDiAdesione attiDiAdesione :
				findByAccordoQuadro(
					FK_accordoQuadro, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(attiDiAdesione);
		}
	}

	/**
	 * Returns the number of atti di adesiones where FK_accordoQuadro = &#63;.
	 *
	 * @param FK_accordoQuadro the fk_accordo quadro
	 * @return the number of matching atti di adesiones
	 */
	@Override
	public int countByAccordoQuadro(long FK_accordoQuadro) {
		FinderPath finderPath = _finderPathCountByAccordoQuadro;

		Object[] finderArgs = new Object[] {FK_accordoQuadro};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTIDIADESIONE_WHERE);

			sb.append(_FINDER_COLUMN_ACCORDOQUADRO_FK_ACCORDOQUADRO_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(FK_accordoQuadro);

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
		_FINDER_COLUMN_ACCORDOQUADRO_FK_ACCORDOQUADRO_2 =
			"attiDiAdesione.FK_accordoQuadro = ?";

	public AttiDiAdesionePersistenceImpl() {
		setModelClass(AttiDiAdesione.class);

		setModelImplClass(AttiDiAdesioneImpl.class);
		setModelPKClass(long.class);

		setTable(AttiDiAdesioneTable.INSTANCE);
	}

	/**
	 * Caches the atti di adesione in the entity cache if it is enabled.
	 *
	 * @param attiDiAdesione the atti di adesione
	 */
	@Override
	public void cacheResult(AttiDiAdesione attiDiAdesione) {
		entityCache.putResult(
			AttiDiAdesioneImpl.class, attiDiAdesione.getPrimaryKey(),
			attiDiAdesione);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the atti di adesiones in the entity cache if it is enabled.
	 *
	 * @param attiDiAdesiones the atti di adesiones
	 */
	@Override
	public void cacheResult(List<AttiDiAdesione> attiDiAdesiones) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attiDiAdesiones.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttiDiAdesione attiDiAdesione : attiDiAdesiones) {
			if (entityCache.getResult(
					AttiDiAdesioneImpl.class, attiDiAdesione.getPrimaryKey()) ==
						null) {

				cacheResult(attiDiAdesione);
			}
		}
	}

	/**
	 * Clears the cache for all atti di adesiones.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttiDiAdesioneImpl.class);

		finderCache.clearCache(AttiDiAdesioneImpl.class);
	}

	/**
	 * Clears the cache for the atti di adesione.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttiDiAdesione attiDiAdesione) {
		entityCache.removeResult(AttiDiAdesioneImpl.class, attiDiAdesione);
	}

	@Override
	public void clearCache(List<AttiDiAdesione> attiDiAdesiones) {
		for (AttiDiAdesione attiDiAdesione : attiDiAdesiones) {
			entityCache.removeResult(AttiDiAdesioneImpl.class, attiDiAdesione);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttiDiAdesioneImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AttiDiAdesioneImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new atti di adesione with the primary key. Does not add the atti di adesione to the database.
	 *
	 * @param Id_AttiDiAdesione the primary key for the new atti di adesione
	 * @return the new atti di adesione
	 */
	@Override
	public AttiDiAdesione create(long Id_AttiDiAdesione) {
		AttiDiAdesione attiDiAdesione = new AttiDiAdesioneImpl();

		attiDiAdesione.setNew(true);
		attiDiAdesione.setPrimaryKey(Id_AttiDiAdesione);

		return attiDiAdesione;
	}

	/**
	 * Removes the atti di adesione with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_AttiDiAdesione the primary key of the atti di adesione
	 * @return the atti di adesione that was removed
	 * @throws NoSuchAttiDiAdesioneException if a atti di adesione with the primary key could not be found
	 */
	@Override
	public AttiDiAdesione remove(long Id_AttiDiAdesione)
		throws NoSuchAttiDiAdesioneException {

		return remove((Serializable)Id_AttiDiAdesione);
	}

	/**
	 * Removes the atti di adesione with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the atti di adesione
	 * @return the atti di adesione that was removed
	 * @throws NoSuchAttiDiAdesioneException if a atti di adesione with the primary key could not be found
	 */
	@Override
	public AttiDiAdesione remove(Serializable primaryKey)
		throws NoSuchAttiDiAdesioneException {

		Session session = null;

		try {
			session = openSession();

			AttiDiAdesione attiDiAdesione = (AttiDiAdesione)session.get(
				AttiDiAdesioneImpl.class, primaryKey);

			if (attiDiAdesione == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttiDiAdesioneException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attiDiAdesione);
		}
		catch (NoSuchAttiDiAdesioneException noSuchEntityException) {
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
	protected AttiDiAdesione removeImpl(AttiDiAdesione attiDiAdesione) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attiDiAdesione)) {
				attiDiAdesione = (AttiDiAdesione)session.get(
					AttiDiAdesioneImpl.class,
					attiDiAdesione.getPrimaryKeyObj());
			}

			if (attiDiAdesione != null) {
				session.delete(attiDiAdesione);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attiDiAdesione != null) {
			clearCache(attiDiAdesione);
		}

		return attiDiAdesione;
	}

	@Override
	public AttiDiAdesione updateImpl(AttiDiAdesione attiDiAdesione) {
		boolean isNew = attiDiAdesione.isNew();

		if (!(attiDiAdesione instanceof AttiDiAdesioneModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attiDiAdesione.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attiDiAdesione);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attiDiAdesione proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttiDiAdesione implementation " +
					attiDiAdesione.getClass());
		}

		AttiDiAdesioneModelImpl attiDiAdesioneModelImpl =
			(AttiDiAdesioneModelImpl)attiDiAdesione;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attiDiAdesione);
			}
			else {
				attiDiAdesione = (AttiDiAdesione)session.merge(attiDiAdesione);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttiDiAdesioneImpl.class, attiDiAdesioneModelImpl, false, true);

		if (isNew) {
			attiDiAdesione.setNew(false);
		}

		attiDiAdesione.resetOriginalValues();

		return attiDiAdesione;
	}

	/**
	 * Returns the atti di adesione with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the atti di adesione
	 * @return the atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a atti di adesione with the primary key could not be found
	 */
	@Override
	public AttiDiAdesione findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttiDiAdesioneException {

		AttiDiAdesione attiDiAdesione = fetchByPrimaryKey(primaryKey);

		if (attiDiAdesione == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttiDiAdesioneException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attiDiAdesione;
	}

	/**
	 * Returns the atti di adesione with the primary key or throws a <code>NoSuchAttiDiAdesioneException</code> if it could not be found.
	 *
	 * @param Id_AttiDiAdesione the primary key of the atti di adesione
	 * @return the atti di adesione
	 * @throws NoSuchAttiDiAdesioneException if a atti di adesione with the primary key could not be found
	 */
	@Override
	public AttiDiAdesione findByPrimaryKey(long Id_AttiDiAdesione)
		throws NoSuchAttiDiAdesioneException {

		return findByPrimaryKey((Serializable)Id_AttiDiAdesione);
	}

	/**
	 * Returns the atti di adesione with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_AttiDiAdesione the primary key of the atti di adesione
	 * @return the atti di adesione, or <code>null</code> if a atti di adesione with the primary key could not be found
	 */
	@Override
	public AttiDiAdesione fetchByPrimaryKey(long Id_AttiDiAdesione) {
		return fetchByPrimaryKey((Serializable)Id_AttiDiAdesione);
	}

	/**
	 * Returns all the atti di adesiones.
	 *
	 * @return the atti di adesiones
	 */
	@Override
	public List<AttiDiAdesione> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the atti di adesiones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @return the range of atti di adesiones
	 */
	@Override
	public List<AttiDiAdesione> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the atti di adesiones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of atti di adesiones
	 */
	@Override
	public List<AttiDiAdesione> findAll(
		int start, int end,
		OrderByComparator<AttiDiAdesione> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the atti di adesiones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttiDiAdesioneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of atti di adesiones
	 * @param end the upper bound of the range of atti di adesiones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of atti di adesiones
	 */
	@Override
	public List<AttiDiAdesione> findAll(
		int start, int end, OrderByComparator<AttiDiAdesione> orderByComparator,
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

		List<AttiDiAdesione> list = null;

		if (useFinderCache) {
			list = (List<AttiDiAdesione>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTIDIADESIONE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTIDIADESIONE;

				sql = sql.concat(AttiDiAdesioneModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttiDiAdesione>)QueryUtil.list(
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
	 * Removes all the atti di adesiones from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttiDiAdesione attiDiAdesione : findAll()) {
			remove(attiDiAdesione);
		}
	}

	/**
	 * Returns the number of atti di adesiones.
	 *
	 * @return the number of atti di adesiones
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ATTIDIADESIONE);

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
		return "Id_AttiDiAdesione";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTIDIADESIONE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttiDiAdesioneModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the atti di adesione persistence.
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

		_finderPathWithPaginationFindByAccordoQuadro = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAccordoQuadro",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"FK_accordoQuadro"}, true);

		_finderPathWithoutPaginationFindByAccordoQuadro = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAccordoQuadro",
			new String[] {Long.class.getName()},
			new String[] {"FK_accordoQuadro"}, true);

		_finderPathCountByAccordoQuadro = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAccordoQuadro",
			new String[] {Long.class.getName()},
			new String[] {"FK_accordoQuadro"}, false);

		_setAttiDiAdesioneUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setAttiDiAdesioneUtilPersistence(null);

		entityCache.removeCache(AttiDiAdesioneImpl.class.getName());
	}

	private void _setAttiDiAdesioneUtilPersistence(
		AttiDiAdesionePersistence attiDiAdesionePersistence) {

		try {
			Field field = AttiDiAdesioneUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, attiDiAdesionePersistence);
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

	private static final String _SQL_SELECT_ATTIDIADESIONE =
		"SELECT attiDiAdesione FROM AttiDiAdesione attiDiAdesione";

	private static final String _SQL_SELECT_ATTIDIADESIONE_WHERE =
		"SELECT attiDiAdesione FROM AttiDiAdesione attiDiAdesione WHERE ";

	private static final String _SQL_COUNT_ATTIDIADESIONE =
		"SELECT COUNT(attiDiAdesione) FROM AttiDiAdesione attiDiAdesione";

	private static final String _SQL_COUNT_ATTIDIADESIONE_WHERE =
		"SELECT COUNT(attiDiAdesione) FROM AttiDiAdesione attiDiAdesione WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "attiDiAdesione.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttiDiAdesione exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttiDiAdesione exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttiDiAdesionePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private AttiDiAdesioneModelArgumentsResolver
		_attiDiAdesioneModelArgumentsResolver;

}