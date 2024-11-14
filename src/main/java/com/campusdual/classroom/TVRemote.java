package com.campusdual.classroom;

public class TVRemote {

    //ATRIBUTOS (no encapsulados para que el test pueda acceder a ellos)
    int channel;
    int volume;
    String color;
    boolean on;

    //CONSTRUCTORES
    public TVRemote(String color) {
        this.channel = 0;
        this.volume = 0;
        this.color = color;
    }

    //GETTERS Y SETTERS

    public int getChannel(){
        return this.channel;
    }

    public void setChannel(int channel){
        if(channel < 0){
            this.channel = channel;
        }else{
            System.out.println("El canal introducido no es válido.");
        }
    }

    public int getVolume(){
        return this.volume;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getOn(){
        return this.on;
    }

    //MÉTODOS

    //SUBIR Y BAJAR CANAL DEL TVRemote

    protected void channelUp() {
        this.channel++;
    }

    protected void channelDown() {
        if (this.checkMinValue(this.channel)) {
            this.channel--;
        }else{
            System.out.println("Estimado usuario. Ya está establecido el canal más pequeño.");
        }
    }

    //SUBIR Y BAJAR VOLUMEN DEL TVRemote

    protected void volumeUp() {
        this.volume++;
    }

    protected void volumeDown() {
        if (this.checkMinValue(this.volume)) {
            this.volume--;
        }
    }

    //ENCENDER Y APAGAR EL TVRemote

    protected boolean turnOn() {
        return this.on = true;
    }

    protected boolean turnOff() {
        return this.on = false;
    }

    //MÉTODOS CONDICIONALES PRIVADOS

    private boolean checkMinValue(int valor) {
        return valor > 0;
    }

}
