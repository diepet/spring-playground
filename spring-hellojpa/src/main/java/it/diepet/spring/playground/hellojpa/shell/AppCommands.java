package it.diepet.spring.playground.hellojpa.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class AppCommands {

    @ShellMethod(value = "Add two integers together.", group = "Mathematical Commands")
    public int add(int a, int b) {
        return a + b;
    }
	
    @ShellMethod(value = "Exit the shell")
    public void exit() {
        System.exit(0);
    }
    
    
}
