/*
 * Copyright (c) 2012-2017 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.plugin.java.languageserver;

import org.eclipse.lsp4j.jsonrpc.services.JsonNotification;

public interface JavaLanguageClient {
  /**
   * The show message notification is sent from a server to a client to ask the client to display a
   * particular message in the user interface.
   */
  @JsonNotification("language/status")
  void sendStatusReport(StatusReport report);
}
