/*
 * Copyright (C) 2010-2015 FBReader.ORG Limited <contact@fbreader.org>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.fbreader.reader.android;

import org.geometerplus.zlibrary.core.resources.ZLResource;

import org.fbreader.common.android.FBReaderUtil;
import org.fbreader.reader.AbstractReader;

class ShowWhatsNewDialogAction extends MainActivity.Action<MainActivity,AbstractReader> {
	ShowWhatsNewDialogAction(MainActivity baseActivity) {
		super(baseActivity);
	}

	@Override
	public boolean isVisible() {
		return FBReaderUtil.resourceFileExists(BaseActivity, "data/whatsnew");
	}

	@Override
	protected void run(Object ... params) {
		FBReaderUtil.showHtmlDialog(
			BaseActivity,
			ZLResource.resource("menu").getResource("whatsnew").getValue(),
			"whatsnew"
		);
	}
}