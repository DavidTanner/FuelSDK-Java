//
// ETUnsubEventService.java -
//
//      x
//
// Copyright (C) 2013 ExactTarget
//
// @COPYRIGHT@
//

package com.exacttarget.fuelsdk;

import com.exacttarget.fuelsdk.filter.ETFilter;
import com.exacttarget.fuelsdk.model.ETUnsubEvent;

public interface ETUnsubEventService extends ETGetService {

	public ETResponse<ETUnsubEvent> get(ETClient client)
	        throws ETSdkException;

	public ETResponse<ETUnsubEvent> get(ETClient client, ETFilter filter)
	        throws ETSdkException;
}
