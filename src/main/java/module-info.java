module br.com.appdahora.helloworld.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens br.com.appdahora.helloworld.helloworldfx to javafx.fxml;
    exports br.com.appdahora.helloworld.helloworldfx;
}