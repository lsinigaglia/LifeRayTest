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

package servicebuilder.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;
import java.util.stream.Collectors;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import servicebuilder.model.AccordoQuadro;
import servicebuilder.model.AttiDiAdesione;
import servicebuilder.service.AttiDiAdesioneLocalService;
import servicebuilder.service.base.AccordoQuadroLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=servicebuilder.model.AccordoQuadro",
	service = AopService.class
)
public class AccordoQuadroLocalServiceImpl
	extends AccordoQuadroLocalServiceBaseImpl {

	public AccordoQuadro deleteAccordoQuadroWithChildren(long id) throws PortalException {
    	List<AttiDiAdesione> attiDiAdesioneList = attiDiAdesionePersistence.findByAccordoQuadro(id);
    	AttiDiAdesioneLocalServiceImpl attiDiAdesioneLocalServicImpl = new AttiDiAdesioneLocalServiceImpl();
    	for ( AttiDiAdesione attiDiAdesione : attiDiAdesioneList) {
			attiDiAdesioneLocalServicImpl.deleteAttiDiAdesioneWithChildren(attiDiAdesione.getPrimaryKey());
    	}

	return this.deleteAccordoQuadro(id);

	}
	
	public List<AccordoQuadro> searchAccordoQuadros(String keywords) throws SystemException {
        List<AccordoQuadro> allAccordoQuadros = accordoQuadroPersistence.findAll();
        if (keywords == null || keywords.isEmpty()) {
            return allAccordoQuadros;
        }

        return allAccordoQuadros.stream()
                .filter(accordoQuadro -> accordoQuadro.getCodiceAccordo().equals(keywords))
                .collect(Collectors.toList());
    }
	
	@Reference
	AttiDiAdesioneLocalService _attiDiAdesioneLocalService;
}