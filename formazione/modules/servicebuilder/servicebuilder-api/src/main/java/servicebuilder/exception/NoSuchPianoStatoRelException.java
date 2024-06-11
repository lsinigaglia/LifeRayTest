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
package servicebuilder.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchPianoStatoRelException extends NoSuchModelException {

	public NoSuchPianoStatoRelException() {
	}

	public NoSuchPianoStatoRelException(String msg) {
		super(msg);
	}

	public NoSuchPianoStatoRelException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchPianoStatoRelException(Throwable throwable) {
		super(throwable);
	}

}