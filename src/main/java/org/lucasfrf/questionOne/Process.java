package org.lucasfrf.questionOne;

public class Process {
    /*
    * Questão 1
    * Implemente o método isOn() abaixo considerando as seguintes informações:
    * 1 - O método isOn() deve chamar o método static isOff(): boolean que verifica se um determinado processo esta desligado
    * 2 - O método isOn() deve obrigatoriamente:
    *   2.1 - Se o processo estiver ligado, retornar true;
    *   2.2 -Senão retornar false;
    * */

    private boolean onOff;

    public Process(boolean situation){
        setOnOff(situation);
    }

    private void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public void turnOn(Process process){
        if (isOff(process)) {
            setOnOff(true);
        }
    }

    public void turnOff(Process process){
        if (isOn(process)) {
            setOnOff(false);
        }
    }
    public static boolean isOff(Process process){
        return !process.onOff;
    }

    public static boolean isOn(Process process) {
        return !isOff(process);
    }

    public static String situationOnOff(Process process) {
        var statusOnOff = "Ligado";
        if (Process.isOff(process)) {
            statusOnOff = "Desligado";
        }
        return String.format("Situação do sistema: %s.", statusOnOff);
    }
}
