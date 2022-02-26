// Copyright 2022 Code Intelligence GmbH
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.api.FuzzerSecurityIssueLow;

public class QuickVariableStringLengthFuzzer {
  public static void fuzzerTestOneInput(FuzzedDataProvider data) {
    String str1 = data.consumeString(10);
    String str2 = data.consumeString(10);
    if (str1.equals("foo") && str2.equals("bar")) {
      throw new FuzzerSecurityIssueLow();
    }
  }
}
