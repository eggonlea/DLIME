/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.eggonlea.ime.latin.utils;

import com.eggonlea.ime.dictionarypack.DictionarySettingsFragment;
import com.eggonlea.ime.latin.about.AboutPreferences;
import com.eggonlea.ime.latin.settings.AccountsSettingsFragment;
import com.eggonlea.ime.latin.settings.AdvancedSettingsFragment;
import com.eggonlea.ime.latin.settings.AppearanceSettingsFragment;
import com.eggonlea.ime.latin.settings.CorrectionSettingsFragment;
import com.eggonlea.ime.latin.settings.CustomInputStyleSettingsFragment;
import com.eggonlea.ime.latin.settings.DebugSettingsFragment;
import com.eggonlea.ime.latin.settings.GestureSettingsFragment;
import com.eggonlea.ime.latin.settings.PreferencesSettingsFragment;
import com.eggonlea.ime.latin.settings.SettingsFragment;
import com.eggonlea.ime.latin.settings.ThemeSettingsFragment;
import com.eggonlea.ime.latin.spellcheck.SpellCheckerSettingsFragment;
import com.eggonlea.ime.latin.userdictionary.UserDictionaryAddWordFragment;
import com.eggonlea.ime.latin.userdictionary.UserDictionaryList;
import com.eggonlea.ime.latin.userdictionary.UserDictionaryLocalePicker;
import com.eggonlea.ime.latin.userdictionary.UserDictionarySettings;

import java.util.HashSet;

public class FragmentUtils {
    private static final HashSet<String> sLatinImeFragments = new HashSet<>();
    static {
        sLatinImeFragments.add(DictionarySettingsFragment.class.getName());
        sLatinImeFragments.add(AboutPreferences.class.getName());
        sLatinImeFragments.add(PreferencesSettingsFragment.class.getName());
        sLatinImeFragments.add(AccountsSettingsFragment.class.getName());
        sLatinImeFragments.add(AppearanceSettingsFragment.class.getName());
        sLatinImeFragments.add(ThemeSettingsFragment.class.getName());
        sLatinImeFragments.add(CustomInputStyleSettingsFragment.class.getName());
        sLatinImeFragments.add(GestureSettingsFragment.class.getName());
        sLatinImeFragments.add(CorrectionSettingsFragment.class.getName());
        sLatinImeFragments.add(AdvancedSettingsFragment.class.getName());
        sLatinImeFragments.add(DebugSettingsFragment.class.getName());
        sLatinImeFragments.add(SettingsFragment.class.getName());
        sLatinImeFragments.add(SpellCheckerSettingsFragment.class.getName());
        sLatinImeFragments.add(UserDictionaryAddWordFragment.class.getName());
        sLatinImeFragments.add(UserDictionaryList.class.getName());
        sLatinImeFragments.add(UserDictionaryLocalePicker.class.getName());
        sLatinImeFragments.add(UserDictionarySettings.class.getName());
    }

    public static boolean isValidFragment(String fragmentName) {
        return sLatinImeFragments.contains(fragmentName);
    }
}
