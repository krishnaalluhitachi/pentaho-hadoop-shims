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

package org.pentaho.hadoop.shim.api.cluster;

/**
 * Created by bryan on 8/7/15.
 */
public class ClusterInitializationException extends Exception {
  public ClusterInitializationException( Throwable cause ) {
    super( cause );
  }
}
