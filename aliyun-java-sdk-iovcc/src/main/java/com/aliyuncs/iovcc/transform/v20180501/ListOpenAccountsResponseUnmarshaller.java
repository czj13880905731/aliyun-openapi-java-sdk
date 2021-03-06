/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListOpenAccountsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListOpenAccountsResponse.OpenAccountsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOpenAccountsResponseUnmarshaller {

	public static ListOpenAccountsResponse unmarshall(ListOpenAccountsResponse listOpenAccountsResponse, UnmarshallerContext _ctx) {
		
		listOpenAccountsResponse.setRequestId(_ctx.stringValue("ListOpenAccountsResponse.RequestId"));

		List<OpenAccountsItem> openAccounts = new ArrayList<OpenAccountsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListOpenAccountsResponse.OpenAccounts.Length"); i++) {
			OpenAccountsItem openAccountsItem = new OpenAccountsItem();
			openAccountsItem.setIdentityId(_ctx.stringValue("ListOpenAccountsResponse.OpenAccounts["+ i +"].IdentityId"));
			openAccountsItem.setAliyunId(_ctx.stringValue("ListOpenAccountsResponse.OpenAccounts["+ i +"].AliyunId"));
			openAccountsItem.setDisplayName(_ctx.stringValue("ListOpenAccountsResponse.OpenAccounts["+ i +"].DisplayName"));
			openAccountsItem.setLoginId(_ctx.stringValue("ListOpenAccountsResponse.OpenAccounts["+ i +"].LoginId"));
			openAccountsItem.setIdp(_ctx.stringValue("ListOpenAccountsResponse.OpenAccounts["+ i +"].Idp"));
			openAccountsItem.setOpenId(_ctx.stringValue("ListOpenAccountsResponse.OpenAccounts["+ i +"].OpenId"));
			openAccountsItem.setMobile(_ctx.stringValue("ListOpenAccountsResponse.OpenAccounts["+ i +"].Mobile"));
			openAccountsItem.setType(_ctx.integerValue("ListOpenAccountsResponse.OpenAccounts["+ i +"].Type"));
			openAccountsItem.setStatus(_ctx.integerValue("ListOpenAccountsResponse.OpenAccounts["+ i +"].Status"));
			openAccountsItem.setRegion(_ctx.stringValue("ListOpenAccountsResponse.OpenAccounts["+ i +"].Region"));
			openAccountsItem.setCreateAccessKey(_ctx.stringValue("ListOpenAccountsResponse.OpenAccounts["+ i +"].CreateAccessKey"));

			openAccounts.add(openAccountsItem);
		}
		listOpenAccountsResponse.setOpenAccounts(openAccounts);
	 
	 	return listOpenAccountsResponse;
	}
}