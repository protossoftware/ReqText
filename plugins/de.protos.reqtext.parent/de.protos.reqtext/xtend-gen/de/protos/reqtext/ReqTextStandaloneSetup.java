/**
 * generated by Xtext 2.9.1
 */
package de.protos.reqtext;

import de.protos.reqtext.ReqTextStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ReqTextStandaloneSetup extends ReqTextStandaloneSetupGenerated {
  public static void doSetup() {
    ReqTextStandaloneSetup _reqTextStandaloneSetup = new ReqTextStandaloneSetup();
    _reqTextStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
