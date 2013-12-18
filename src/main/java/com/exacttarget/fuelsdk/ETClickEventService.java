//
// ETClickEventService.java -
//
//      x
//
// Copyright (C) 2013 ExactTarget
//
// @COPYRIGHT@
//

package com.exacttarget.fuelsdk;

import com.exacttarget.fuelsdk.filter.ETFilter;
import com.exacttarget.fuelsdk.model.ETClickEvent;

public interface ETClickEventService extends ETGetService {

	public ETResponse<ETClickEvent> get(ETClient client)
	        throws ETSdkException;

	public ETResponse<ETClickEvent> get(ETClient client, ETFilter filter)
	        throws ETSdkException;
}
