package org.mxworld.hra.model.am.client;

import oracle.jbo.client.remote.ApplicationModuleImpl;

import org.mxworld.hra.model.am.common.HraService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Apr 27 21:36:24 EDT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HraServiceClient extends ApplicationModuleImpl implements HraService {
    /**
     * This is the default constructor (do not remove).
     */
    public HraServiceClient() {
    }

    public void createNewImageForEmployee(Integer employeeId, String imageName) {
        Object _ret = this.riInvokeExportedMethod(this, "createNewImageForEmployee", new String[] {
                                                  "java.lang.Integer", "java.lang.String" }, new Object[] {
                                                  employeeId, imageName });
        return;
    }
}

