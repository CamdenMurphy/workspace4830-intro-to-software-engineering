package p6.form_template_method1.refactored;

public class A {
   void sendMessage(Service svc) {
      new MessageSendTask().common(svc);
   }

   void saveMessage(Service svc) {
      new MessageSaveTask().common(svc);
   }

   void receiveMessage(Service svc) {
      new MessageReceiveTask().common(svc);
   }
}

abstract class Template {
   void common(Service svc) {
      svc.beginTask();
      processMessage(svc);
      // other common parts go here.
      svc.endTask();
   }

   abstract void processMessage(Service svc);
}

class MessageSendTask extends Template {

   @Override
   void processMessage(Service svc) {
      svc.sendMessage();
   }
}

class MessageSaveTask extends Template {

   @Override
   void processMessage(Service svc) {
      svc.saveMessage();
   }
}

class MessageReceiveTask extends Template {

   @Override
   void processMessage(Service svc) {
      svc.receiveMessage();
   }
}
