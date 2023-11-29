package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.devio.as.hi.hi_arouter.LoginServiceImpl;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY AROUTER. */
public class ARouter$$Group$$service implements IRouteGroup {
  @Override
  public void loadInto(Map<String, RouteMeta> atlas) {
    atlas.put("/service/login", RouteMeta.build(RouteType.PROVIDER, LoginServiceImpl.class, "/service/login", "service", null, -1, -2147483648));
  }
}
