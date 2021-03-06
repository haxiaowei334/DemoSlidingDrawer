/***
  Copyright (c) 2008-2011 CommonsWare, LLC
  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain	a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
  by applicable law or agreed to in writing, software distributed under the
  License is distributed on an "AS IS" BASIS,	WITHOUT	WARRANTIES OR CONDITIONS
  OF ANY KIND, either express or implied. See the License for the specific
  language governing permissions and limitations under the License.
	
  From _The Busy Coder's Guide to Android Development_
    http://commonsware.com/Android
*/

package com.commonsware.android.rwversions;

import android.os.Build;

abstract class StrictWrapper {
  static public void init() {
    if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.GINGERBREAD) {
      new StrictForRealz();
    }
    else {
      new NotAllThatStrict();
    }
  }
  
  static class NotAllThatStrict extends StrictWrapper {
    // no methods needed
  }
}
