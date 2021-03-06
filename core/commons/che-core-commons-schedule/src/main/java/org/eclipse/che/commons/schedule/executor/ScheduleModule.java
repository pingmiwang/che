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
package org.eclipse.che.commons.schedule.executor;

import com.google.inject.Binder;
import com.google.inject.Module;
import org.eclipse.che.commons.schedule.Launcher;
import org.eclipse.che.inject.lifecycle.InternalScheduleModule;

/**
 * Guice deployment module.
 *
 * @author Sergii Kabashniuk
 */
public class ScheduleModule implements Module {
  @Override
  public void configure(Binder binder) {
    binder.bind(Launcher.class).to(ThreadPullLauncher.class).asEagerSingleton();
    binder.install(new InternalScheduleModule());
  }
}
