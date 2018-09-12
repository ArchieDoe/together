package gretham.together.capabilities.factories;

import gretham.together.capabilities.IProfessionCapability;

import java.util.concurrent.Callable;

public class ProfessionCapabilityFactory implements Callable<IProfessionCapability> {
    private Class<? extends IProfessionCapability> desiredClass;

    public ProfessionCapabilityFactory(Class<? extends IProfessionCapability> classToCreate) {
        desiredClass = classToCreate;
    }

    @Override
    public IProfessionCapability call() throws Exception {
        return desiredClass.newInstance();
    }
}