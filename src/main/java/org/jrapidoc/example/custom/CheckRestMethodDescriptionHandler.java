package org.jrapidoc.example.custom;

import org.apache.commons.lang3.StringUtils;
import org.projectodd.jrapidoc.logger.Logger;
import org.projectodd.jrapidoc.model.APIModel;
import org.projectodd.jrapidoc.model.Method;
import org.projectodd.jrapidoc.model.Service;
import org.projectodd.jrapidoc.model.ServiceGroup;
import org.projectodd.jrapidoc.model.handler.HandlerException;
import org.projectodd.jrapidoc.model.handler.ModelHandler;

/**
 * Created by Tomas "sarzwest" Jiricek on 12.4.15.
 */
public class CheckRestMethodDescriptionHandler implements ModelHandler {
    @Override
    public void handleModel(APIModel model) throws HandlerException {
        for (ServiceGroup serviceGroup : model.getServiceGroups().values()) {
            for (Service service : serviceGroup.getServices().values()) {
                for (Method method : service.getMethods().values()) {
                    if (StringUtils.isEmpty(method.getDescription())) {
                        Logger.warn("Method {0} has not set description",
                                method.getPath());
                    }
                }
            }
        }
    }
}
