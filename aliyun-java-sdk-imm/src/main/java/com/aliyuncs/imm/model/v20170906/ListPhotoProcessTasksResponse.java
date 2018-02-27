/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.ListPhotoProcessTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPhotoProcessTasksResponse extends AcsResponse {

	private String requestId;

	private String nextMarker;

	private List<TasksItem> tasks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextMarker() {
		return this.nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

	public List<TasksItem> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<TasksItem> tasks) {
		this.tasks = tasks;
	}

	public static class TasksItem {

		private String taskId;

		private String status;

		private String srcUri;

		private String tgtUri;

		private String style;

		private String notifyTopicName;

		private String notifyEndpoint;

		private String externalID;

		private String createTime;

		private String finishTime;

		private Integer percent;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSrcUri() {
			return this.srcUri;
		}

		public void setSrcUri(String srcUri) {
			this.srcUri = srcUri;
		}

		public String getTgtUri() {
			return this.tgtUri;
		}

		public void setTgtUri(String tgtUri) {
			this.tgtUri = tgtUri;
		}

		public String getStyle() {
			return this.style;
		}

		public void setStyle(String style) {
			this.style = style;
		}

		public String getNotifyTopicName() {
			return this.notifyTopicName;
		}

		public void setNotifyTopicName(String notifyTopicName) {
			this.notifyTopicName = notifyTopicName;
		}

		public String getNotifyEndpoint() {
			return this.notifyEndpoint;
		}

		public void setNotifyEndpoint(String notifyEndpoint) {
			this.notifyEndpoint = notifyEndpoint;
		}

		public String getExternalID() {
			return this.externalID;
		}

		public void setExternalID(String externalID) {
			this.externalID = externalID;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public Integer getPercent() {
			return this.percent;
		}

		public void setPercent(Integer percent) {
			this.percent = percent;
		}
	}

	@Override
	public ListPhotoProcessTasksResponse getInstance(UnmarshallerContext context) {
		return	ListPhotoProcessTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
