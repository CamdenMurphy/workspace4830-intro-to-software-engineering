package p6.form_template_method1.org;

public class A {
   void sendMessage(Service svc) {
      svc.beginTask();
      // other common parts go here.
      svc.sendMessage();
      // other common parts go here.
      svc.endTask();
   }

   void saveMessage(Service svc) {
      svc.beginTask();
      // other common parts go here.
      svc.saveMessage();
      // other common parts go here.
      svc.endTask();
   }

   void receiveMessage(Service svc) {
      // same pattern
      svc.beginTask();
      // other common parts go here.
      svc.receiveMessage();
      // other common parts go here.
      svc.endTask();
   }
}
