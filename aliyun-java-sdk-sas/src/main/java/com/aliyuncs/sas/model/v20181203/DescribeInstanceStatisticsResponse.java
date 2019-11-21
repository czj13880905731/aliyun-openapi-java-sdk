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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeInstanceStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String uuid;

		private Integer account;

		private Integer health;

		private Integer trojan;

		private Integer suspicious;

		private Integer vul;

		private Integer cveNum;

		private Integer emgNum;

		private Integer sysNum;

		private Integer cmsNum;

		private Integer appNum;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Integer getAccount() {
			return this.account;
		}

		public void setAccount(Integer account) {
			this.account = account;
		}

		public Integer getHealth() {
			return this.health;
		}

		public void setHealth(Integer health) {
			this.health = health;
		}

		public Integer getTrojan() {
			return this.trojan;
		}

		public void setTrojan(Integer trojan) {
			this.trojan = trojan;
		}

		public Integer getSuspicious() {
			return this.suspicious;
		}

		public void setSuspicious(Integer suspicious) {
			this.suspicious = suspicious;
		}

		public Integer getVul() {
			return this.vul;
		}

		public void setVul(Integer vul) {
			this.vul = vul;
		}

		public Integer getCveNum() {
			return this.cveNum;
		}

		public void setCveNum(Integer cveNum) {
			this.cveNum = cveNum;
		}

		public Integer getEmgNum() {
			return this.emgNum;
		}

		public void setEmgNum(Integer emgNum) {
			this.emgNum = emgNum;
		}

		public Integer getSysNum() {
			return this.sysNum;
		}

		public void setSysNum(Integer sysNum) {
			this.sysNum = sysNum;
		}

		public Integer getCmsNum() {
			return this.cmsNum;
		}

		public void setCmsNum(Integer cmsNum) {
			this.cmsNum = cmsNum;
		}

		public Integer getAppNum() {
			return this.appNum;
		}

		public void setAppNum(Integer appNum) {
			this.appNum = appNum;
		}
	}

	@Override
	public DescribeInstanceStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
