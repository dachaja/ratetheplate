
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/adokalways/Documents/Projects/dachaja/ratetheplate/conf/routes
// @DATE:Thu Jun 11 22:36:57 PDT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
