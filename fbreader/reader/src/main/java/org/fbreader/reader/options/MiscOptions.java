/*
 * Copyright (C) 2007-2015 FBReader.ORG Limited <contact@fbreader.org>
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

package org.fbreader.reader.options;

import org.geometerplus.zlibrary.core.options.*;
import org.fbreader.common.DurationEnum;

public class MiscOptions {
	public final ZLBooleanOption AllowScreenBrightnessAdjustment =
		new ZLBooleanOption("LookNFeel", "AllowScreenBrightnessAdjustment", true);
	public final ZLBooleanOption EnableBookMenuSwipeGesture =
		new ZLBooleanOption("LookNFeel", "EnableBookMenuSwipeGesture", false);

	public final ZLBooleanOption EnableDoubleTap =
		new ZLBooleanOption("Options", "EnableDoubleTap", false);
	public final ZLBooleanOption NavigateAllWords =
		new ZLBooleanOption("Options", "NavigateAllWords", false);

	public static enum WordTappingActionEnum {
		doNothing, selectSingleWord, startSelecting, openDictionary
	}
	public final ZLEnumOption<WordTappingActionEnum> WordTappingAction =
		new ZLEnumOption<WordTappingActionEnum>("Options", "WordTappingAction", WordTappingActionEnum.startSelecting);

	public final ZLIntegerRangeOption ToastFontSizePercent =
		new ZLIntegerRangeOption("Options", "ToastFontSizePercent", 25, 100, 90);
	public static enum FootnoteToastEnum {
		never, footnotesOnly, footnotesAndSuperscripts, allInternalLinks
	}
	public final ZLEnumOption<FootnoteToastEnum> ShowFootnoteToast =
		new ZLEnumOption<FootnoteToastEnum>("Options", "ShowFootnoteToast", FootnoteToastEnum.footnotesAndSuperscripts);
	public final ZLEnumOption<DurationEnum> FootnoteToastDuration =
		new ZLEnumOption<DurationEnum>("Options", "FootnoteToastDuration", DurationEnum.duration5);

	public final ZLBooleanOption CoverAsMenuBackground =
		new ZLBooleanOption("Options", "CoverAsMenuBackground", true);
}