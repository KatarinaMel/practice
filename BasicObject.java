/**
 * Class representing a very simple object
 */
class BasicObject {
  public String name;
  public int num;
  public String msg;

  /**
   * Default ctor
   */
  public BasicObject() {
    name = "name";
    num = 0;
    msg = "Hello, world!";
  }

  /**
   * All-params ctor
   */
  public BasicObject(String inName, int inNum, String inMsg) {
    this.name = inName;
    this.num = inNum;
    this.msg = inMsg;
  }
}
