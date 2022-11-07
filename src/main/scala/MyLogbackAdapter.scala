import ch.qos.logback.classic.util.LogbackMDCAdapter

class MyLogbackAdapter extends LogbackMDCAdapter {

  // [error] /dev/logback-issue/src/main/scala/MyLogbackAdapter.scala:4:16: name clash between defined and inherited member:
  // [error] def setContextMap(x$1: java.util.Map[_, _]): Unit in class LogbackMDCAdapter and
  // [error] override def setContextMap(contextMap: java.util.Map[String,String]): Unit at line 4
  // [error] have same type after erasure: (x$1: java.util.Map): Unit
  // [error]   override def setContextMap(contextMap: java.util.Map[String, String]): Unit =
  // [error]                ^
  // [error] one error found
  override def setContextMap(contextMap: java.util.Map[String, String]): Unit =
    ???

  // MDCAdapter defines setContextMap like:
  // public void setContextMap(Map<String, String> contextMap)

  //  LogbackMDCAdapter defines setContextMap like:
  //  @SuppressWarnings("unchecked")
  //  public Unit setContextMap(contextMap: Map[_, _])

}
