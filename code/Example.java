
package org.streampipes.example.pe.processor.example;

import org.streampipes.commons.exceptions.SpRuntimeException;
import org.streampipes.model.graph.DataProcessorInvocation;
import org.streampipes.wrapper.routing.SpOutputCollector;
import org.streampipes.wrapper.standalone.engine.StandaloneEventProcessorEngine;

import org.slf4j.Logger;

import java.util.Map;

public class Example extends StandaloneEventProcessorEngine<ExampleParameters> {

  private static Logger LOG;

  public Example(ExampleParameters params) {
        super(params);
  }

  @Override
  public void onInvocation(ExampleParameters parameters,
        DataProcessorInvocation graph) {

  }

  @Override
  public void onEvent(Map<String, Object> in, String sourceInfo, SpOutputCollector out) {

    float latitude = Float.parseFloat((String) in.get("latitude"));
    float longitude = Float.parseFloat((String) in.get("longitude"));

    float karlsruhe_latitude = 49.00937f;
    float karlsruhe_longitude = 8.40444f;

    double distance = CalculateDistance.dist(latitude, longitude, karlsruhe_latitude, karlsruhe_longitude);

    in.put("distance_to_iss", distance);

    out.onEvent(in);
  }



  @Override
  public void onDetach() {

  }


}
