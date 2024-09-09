
package Command;

public class Main {
    public static void main(String[] args) {
        // Receptor de la acción
        Light light = new Light();

        // Comandos concretos
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Invocador
        RemoteControl remoteControl = new RemoteControl();

        // Encender la luz
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        // Apagar la luz
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
}
