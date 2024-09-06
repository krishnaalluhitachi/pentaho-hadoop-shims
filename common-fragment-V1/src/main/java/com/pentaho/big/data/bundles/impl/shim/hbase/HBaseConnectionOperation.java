/*! ******************************************************************************
 *
 * Pentaho Community Edition
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2028-08-13
 ******************************************************************************/

package com.pentaho.big.data.bundles.impl.shim.hbase;

import java.io.IOException;

/**
 * Created by bryan on 1/26/16.
 */
public interface HBaseConnectionOperation {
  void perform( HBaseConnectionWrapper hBaseConnectionWrapper ) throws IOException;
}
