/**
 * generated by Xtext 2.9.1
 */
package de.protos.reqtext.web;

import com.google.inject.Provider;
import de.protos.reqtext.web.AbstractReqTextWebModule;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;

/**
 * Use this class to register additional components to be used within the web application.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class ReqTextWebModule extends AbstractReqTextWebModule {
  public ReqTextWebModule(final Provider<ExecutorService> executorServiceProvider) {
    super(executorServiceProvider);
  }
}