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

import servicebuilder.exception.NoSuchProgettiFabbisogniException;

import servicebuilder.model.ProgettiFabbisogni;
import servicebuilder.model.ProgettiFabbisogniTable;
import servicebuilder.model.impl.ProgettiFabbisogniImpl;
import servicebuilder.model.impl.ProgettiFabbisogniModelImpl;

import servicebuilder.service.persistence.ProgettiFabbisogniPersistence;
import servicebuilder.service.persistence.ProgettiFabbisogniUtil;
import servicebuilder.service.persistence.impl.constants.AQPersistenceConstants;

/**
 * The persistence implementation for the progetti fabbisogni service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {ProgettiFabbisogniPersistence.class, BasePersistence.class}
)
public class ProgettiFabbisogniPersistenceImpl
	extends BasePersistenceImpl<ProgettiFabbisogni>
	implements ProgettiFabbisogniPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ProgettiFabbisogniUtil</code> to access the progetti fabbisogni persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ProgettiFabbisogniImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByPianiFabbisogni;
	private FinderPath _finderPathWithoutPaginationFindByPianiFabbisogni;
	private FinderPath _finderPathCountByPianiFabbisogni;

	/**
	 * Returns all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @return the matching progetti fabbisognis
	 */
	@Override
	public List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni) {

		return findByPianiFabbisogni(
			FK_pianiFabbisogni, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @return the range of matching progetti fabbisognis
	 */
	@Override
	public List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni, int start, int end) {

		return findByPianiFabbisogni(FK_pianiFabbisogni, start, end, null);
	}

	/**
	 * Returns an ordered range of all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching progetti fabbisognis
	 */
	@Override
	public List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni, int start, int end,
		OrderByComparator<ProgettiFabbisogni> orderByComparator) {

		return findByPianiFabbisogni(
			FK_pianiFabbisogni, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching progetti fabbisognis
	 */
	@Override
	public List<ProgettiFabbisogni> findByPianiFabbisogni(
		long FK_pianiFabbisogni, int start, int end,
		OrderByComparator<ProgettiFabbisogni> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByPianiFabbisogni;
				finderArgs = new Object[] {FK_pianiFabbisogni};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByPianiFabbisogni;
			finderArgs = new Object[] {
				FK_pianiFabbisogni, start, end, orderByComparator
			};
		}

		List<ProgettiFabbisogni> list = null;

		if (useFinderCache) {
			list = (List<ProgettiFabbisogni>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (ProgettiFabbisogni progettiFabbisogni : list) {
					if (FK_pianiFabbisogni !=
							progettiFabbisogni.getFK_pianiFabbisogni()) {

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

			sb.append(_SQL_SELECT_PROGETTIFABBISOGNI_WHERE);

			sb.append(_FINDER_COLUMN_PIANIFABBISOGNI_FK_PIANIFABBISOGNI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ProgettiFabbisogniModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(FK_pianiFabbisogni);

				list = (List<ProgettiFabbisogni>)QueryUtil.list(
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
	 * Returns the first progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a matching progetti fabbisogni could not be found
	 */
	@Override
	public ProgettiFabbisogni findByPianiFabbisogni_First(
			long FK_pianiFabbisogni,
			OrderByComparator<ProgettiFabbisogni> orderByComparator)
		throws NoSuchProgettiFabbisogniException {

		ProgettiFabbisogni progettiFabbisogni = fetchByPianiFabbisogni_First(
			FK_pianiFabbisogni, orderByComparator);

		if (progettiFabbisogni != null) {
			return progettiFabbisogni;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("FK_pianiFabbisogni=");
		sb.append(FK_pianiFabbisogni);

		sb.append("}");

		throw new NoSuchProgettiFabbisogniException(sb.toString());
	}

	/**
	 * Returns the first progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching progetti fabbisogni, or <code>null</code> if a matching progetti fabbisogni could not be found
	 */
	@Override
	public ProgettiFabbisogni fetchByPianiFabbisogni_First(
		long FK_pianiFabbisogni,
		OrderByComparator<ProgettiFabbisogni> orderByComparator) {

		List<ProgettiFabbisogni> list = findByPianiFabbisogni(
			FK_pianiFabbisogni, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a matching progetti fabbisogni could not be found
	 */
	@Override
	public ProgettiFabbisogni findByPianiFabbisogni_Last(
			long FK_pianiFabbisogni,
			OrderByComparator<ProgettiFabbisogni> orderByComparator)
		throws NoSuchProgettiFabbisogniException {

		ProgettiFabbisogni progettiFabbisogni = fetchByPianiFabbisogni_Last(
			FK_pianiFabbisogni, orderByComparator);

		if (progettiFabbisogni != null) {
			return progettiFabbisogni;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("FK_pianiFabbisogni=");
		sb.append(FK_pianiFabbisogni);

		sb.append("}");

		throw new NoSuchProgettiFabbisogniException(sb.toString());
	}

	/**
	 * Returns the last progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching progetti fabbisogni, or <code>null</code> if a matching progetti fabbisogni could not be found
	 */
	@Override
	public ProgettiFabbisogni fetchByPianiFabbisogni_Last(
		long FK_pianiFabbisogni,
		OrderByComparator<ProgettiFabbisogni> orderByComparator) {

		int count = countByPianiFabbisogni(FK_pianiFabbisogni);

		if (count == 0) {
			return null;
		}

		List<ProgettiFabbisogni> list = findByPianiFabbisogni(
			FK_pianiFabbisogni, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the progetti fabbisognis before and after the current progetti fabbisogni in the ordered set where FK_pianiFabbisogni = &#63;.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the current progetti fabbisogni
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a progetti fabbisogni with the primary key could not be found
	 */
	@Override
	public ProgettiFabbisogni[] findByPianiFabbisogni_PrevAndNext(
			long Id_ProgettiFabbisogni, long FK_pianiFabbisogni,
			OrderByComparator<ProgettiFabbisogni> orderByComparator)
		throws NoSuchProgettiFabbisogniException {

		ProgettiFabbisogni progettiFabbisogni = findByPrimaryKey(
			Id_ProgettiFabbisogni);

		Session session = null;

		try {
			session = openSession();

			ProgettiFabbisogni[] array = new ProgettiFabbisogniImpl[3];

			array[0] = getByPianiFabbisogni_PrevAndNext(
				session, progettiFabbisogni, FK_pianiFabbisogni,
				orderByComparator, true);

			array[1] = progettiFabbisogni;

			array[2] = getByPianiFabbisogni_PrevAndNext(
				session, progettiFabbisogni, FK_pianiFabbisogni,
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

	protected ProgettiFabbisogni getByPianiFabbisogni_PrevAndNext(
		Session session, ProgettiFabbisogni progettiFabbisogni,
		long FK_pianiFabbisogni,
		OrderByComparator<ProgettiFabbisogni> orderByComparator,
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

		sb.append(_SQL_SELECT_PROGETTIFABBISOGNI_WHERE);

		sb.append(_FINDER_COLUMN_PIANIFABBISOGNI_FK_PIANIFABBISOGNI_2);

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
			sb.append(ProgettiFabbisogniModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(FK_pianiFabbisogni);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						progettiFabbisogni)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ProgettiFabbisogni> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the progetti fabbisognis where FK_pianiFabbisogni = &#63; from the database.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 */
	@Override
	public void removeByPianiFabbisogni(long FK_pianiFabbisogni) {
		for (ProgettiFabbisogni progettiFabbisogni :
				findByPianiFabbisogni(
					FK_pianiFabbisogni, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(progettiFabbisogni);
		}
	}

	/**
	 * Returns the number of progetti fabbisognis where FK_pianiFabbisogni = &#63;.
	 *
	 * @param FK_pianiFabbisogni the fk_piani fabbisogni
	 * @return the number of matching progetti fabbisognis
	 */
	@Override
	public int countByPianiFabbisogni(long FK_pianiFabbisogni) {
		FinderPath finderPath = _finderPathCountByPianiFabbisogni;

		Object[] finderArgs = new Object[] {FK_pianiFabbisogni};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PROGETTIFABBISOGNI_WHERE);

			sb.append(_FINDER_COLUMN_PIANIFABBISOGNI_FK_PIANIFABBISOGNI_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(FK_pianiFabbisogni);

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
		_FINDER_COLUMN_PIANIFABBISOGNI_FK_PIANIFABBISOGNI_2 =
			"progettiFabbisogni.FK_pianiFabbisogni = ?";

	public ProgettiFabbisogniPersistenceImpl() {
		setModelClass(ProgettiFabbisogni.class);

		setModelImplClass(ProgettiFabbisogniImpl.class);
		setModelPKClass(long.class);

		setTable(ProgettiFabbisogniTable.INSTANCE);
	}

	/**
	 * Caches the progetti fabbisogni in the entity cache if it is enabled.
	 *
	 * @param progettiFabbisogni the progetti fabbisogni
	 */
	@Override
	public void cacheResult(ProgettiFabbisogni progettiFabbisogni) {
		entityCache.putResult(
			ProgettiFabbisogniImpl.class, progettiFabbisogni.getPrimaryKey(),
			progettiFabbisogni);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the progetti fabbisognis in the entity cache if it is enabled.
	 *
	 * @param progettiFabbisognis the progetti fabbisognis
	 */
	@Override
	public void cacheResult(List<ProgettiFabbisogni> progettiFabbisognis) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (progettiFabbisognis.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ProgettiFabbisogni progettiFabbisogni : progettiFabbisognis) {
			if (entityCache.getResult(
					ProgettiFabbisogniImpl.class,
					progettiFabbisogni.getPrimaryKey()) == null) {

				cacheResult(progettiFabbisogni);
			}
		}
	}

	/**
	 * Clears the cache for all progetti fabbisognis.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProgettiFabbisogniImpl.class);

		finderCache.clearCache(ProgettiFabbisogniImpl.class);
	}

	/**
	 * Clears the cache for the progetti fabbisogni.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProgettiFabbisogni progettiFabbisogni) {
		entityCache.removeResult(
			ProgettiFabbisogniImpl.class, progettiFabbisogni);
	}

	@Override
	public void clearCache(List<ProgettiFabbisogni> progettiFabbisognis) {
		for (ProgettiFabbisogni progettiFabbisogni : progettiFabbisognis) {
			entityCache.removeResult(
				ProgettiFabbisogniImpl.class, progettiFabbisogni);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ProgettiFabbisogniImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ProgettiFabbisogniImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new progetti fabbisogni with the primary key. Does not add the progetti fabbisogni to the database.
	 *
	 * @param Id_ProgettiFabbisogni the primary key for the new progetti fabbisogni
	 * @return the new progetti fabbisogni
	 */
	@Override
	public ProgettiFabbisogni create(long Id_ProgettiFabbisogni) {
		ProgettiFabbisogni progettiFabbisogni = new ProgettiFabbisogniImpl();

		progettiFabbisogni.setNew(true);
		progettiFabbisogni.setPrimaryKey(Id_ProgettiFabbisogni);

		return progettiFabbisogni;
	}

	/**
	 * Removes the progetti fabbisogni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni that was removed
	 * @throws NoSuchProgettiFabbisogniException if a progetti fabbisogni with the primary key could not be found
	 */
	@Override
	public ProgettiFabbisogni remove(long Id_ProgettiFabbisogni)
		throws NoSuchProgettiFabbisogniException {

		return remove((Serializable)Id_ProgettiFabbisogni);
	}

	/**
	 * Removes the progetti fabbisogni with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni that was removed
	 * @throws NoSuchProgettiFabbisogniException if a progetti fabbisogni with the primary key could not be found
	 */
	@Override
	public ProgettiFabbisogni remove(Serializable primaryKey)
		throws NoSuchProgettiFabbisogniException {

		Session session = null;

		try {
			session = openSession();

			ProgettiFabbisogni progettiFabbisogni =
				(ProgettiFabbisogni)session.get(
					ProgettiFabbisogniImpl.class, primaryKey);

			if (progettiFabbisogni == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProgettiFabbisogniException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(progettiFabbisogni);
		}
		catch (NoSuchProgettiFabbisogniException noSuchEntityException) {
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
	protected ProgettiFabbisogni removeImpl(
		ProgettiFabbisogni progettiFabbisogni) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(progettiFabbisogni)) {
				progettiFabbisogni = (ProgettiFabbisogni)session.get(
					ProgettiFabbisogniImpl.class,
					progettiFabbisogni.getPrimaryKeyObj());
			}

			if (progettiFabbisogni != null) {
				session.delete(progettiFabbisogni);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (progettiFabbisogni != null) {
			clearCache(progettiFabbisogni);
		}

		return progettiFabbisogni;
	}

	@Override
	public ProgettiFabbisogni updateImpl(
		ProgettiFabbisogni progettiFabbisogni) {

		boolean isNew = progettiFabbisogni.isNew();

		if (!(progettiFabbisogni instanceof ProgettiFabbisogniModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(progettiFabbisogni.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					progettiFabbisogni);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in progettiFabbisogni proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ProgettiFabbisogni implementation " +
					progettiFabbisogni.getClass());
		}

		ProgettiFabbisogniModelImpl progettiFabbisogniModelImpl =
			(ProgettiFabbisogniModelImpl)progettiFabbisogni;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(progettiFabbisogni);
			}
			else {
				progettiFabbisogni = (ProgettiFabbisogni)session.merge(
					progettiFabbisogni);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ProgettiFabbisogniImpl.class, progettiFabbisogniModelImpl, false,
			true);

		if (isNew) {
			progettiFabbisogni.setNew(false);
		}

		progettiFabbisogni.resetOriginalValues();

		return progettiFabbisogni;
	}

	/**
	 * Returns the progetti fabbisogni with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a progetti fabbisogni with the primary key could not be found
	 */
	@Override
	public ProgettiFabbisogni findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProgettiFabbisogniException {

		ProgettiFabbisogni progettiFabbisogni = fetchByPrimaryKey(primaryKey);

		if (progettiFabbisogni == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProgettiFabbisogniException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return progettiFabbisogni;
	}

	/**
	 * Returns the progetti fabbisogni with the primary key or throws a <code>NoSuchProgettiFabbisogniException</code> if it could not be found.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni
	 * @throws NoSuchProgettiFabbisogniException if a progetti fabbisogni with the primary key could not be found
	 */
	@Override
	public ProgettiFabbisogni findByPrimaryKey(long Id_ProgettiFabbisogni)
		throws NoSuchProgettiFabbisogniException {

		return findByPrimaryKey((Serializable)Id_ProgettiFabbisogni);
	}

	/**
	 * Returns the progetti fabbisogni with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id_ProgettiFabbisogni the primary key of the progetti fabbisogni
	 * @return the progetti fabbisogni, or <code>null</code> if a progetti fabbisogni with the primary key could not be found
	 */
	@Override
	public ProgettiFabbisogni fetchByPrimaryKey(long Id_ProgettiFabbisogni) {
		return fetchByPrimaryKey((Serializable)Id_ProgettiFabbisogni);
	}

	/**
	 * Returns all the progetti fabbisognis.
	 *
	 * @return the progetti fabbisognis
	 */
	@Override
	public List<ProgettiFabbisogni> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the progetti fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @return the range of progetti fabbisognis
	 */
	@Override
	public List<ProgettiFabbisogni> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the progetti fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of progetti fabbisognis
	 */
	@Override
	public List<ProgettiFabbisogni> findAll(
		int start, int end,
		OrderByComparator<ProgettiFabbisogni> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the progetti fabbisognis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProgettiFabbisogniModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of progetti fabbisognis
	 * @param end the upper bound of the range of progetti fabbisognis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of progetti fabbisognis
	 */
	@Override
	public List<ProgettiFabbisogni> findAll(
		int start, int end,
		OrderByComparator<ProgettiFabbisogni> orderByComparator,
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

		List<ProgettiFabbisogni> list = null;

		if (useFinderCache) {
			list = (List<ProgettiFabbisogni>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PROGETTIFABBISOGNI);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PROGETTIFABBISOGNI;

				sql = sql.concat(ProgettiFabbisogniModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ProgettiFabbisogni>)QueryUtil.list(
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
	 * Removes all the progetti fabbisognis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ProgettiFabbisogni progettiFabbisogni : findAll()) {
			remove(progettiFabbisogni);
		}
	}

	/**
	 * Returns the number of progetti fabbisognis.
	 *
	 * @return the number of progetti fabbisognis
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
					_SQL_COUNT_PROGETTIFABBISOGNI);

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
		return "Id_ProgettiFabbisogni";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PROGETTIFABBISOGNI;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ProgettiFabbisogniModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the progetti fabbisogni persistence.
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

		_finderPathWithPaginationFindByPianiFabbisogni = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPianiFabbisogni",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"FK_pianiFabbisogni"}, true);

		_finderPathWithoutPaginationFindByPianiFabbisogni = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPianiFabbisogni",
			new String[] {Long.class.getName()},
			new String[] {"FK_pianiFabbisogni"}, true);

		_finderPathCountByPianiFabbisogni = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPianiFabbisogni",
			new String[] {Long.class.getName()},
			new String[] {"FK_pianiFabbisogni"}, false);

		_setProgettiFabbisogniUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setProgettiFabbisogniUtilPersistence(null);

		entityCache.removeCache(ProgettiFabbisogniImpl.class.getName());
	}

	private void _setProgettiFabbisogniUtilPersistence(
		ProgettiFabbisogniPersistence progettiFabbisogniPersistence) {

		try {
			Field field = ProgettiFabbisogniUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, progettiFabbisogniPersistence);
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

	private static final String _SQL_SELECT_PROGETTIFABBISOGNI =
		"SELECT progettiFabbisogni FROM ProgettiFabbisogni progettiFabbisogni";

	private static final String _SQL_SELECT_PROGETTIFABBISOGNI_WHERE =
		"SELECT progettiFabbisogni FROM ProgettiFabbisogni progettiFabbisogni WHERE ";

	private static final String _SQL_COUNT_PROGETTIFABBISOGNI =
		"SELECT COUNT(progettiFabbisogni) FROM ProgettiFabbisogni progettiFabbisogni";

	private static final String _SQL_COUNT_PROGETTIFABBISOGNI_WHERE =
		"SELECT COUNT(progettiFabbisogni) FROM ProgettiFabbisogni progettiFabbisogni WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "progettiFabbisogni.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ProgettiFabbisogni exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ProgettiFabbisogni exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ProgettiFabbisogniPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private ProgettiFabbisogniModelArgumentsResolver
		_progettiFabbisogniModelArgumentsResolver;

}