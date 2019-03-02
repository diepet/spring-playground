package it.diepet.spring.playground.hellojpa;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		String[] disabledCommands = { "--spring.shell.command.exit.enabled=false",
				"--spring.shell.command.quit.enabled=false" };
		String[] fullArgs = StringUtils.concatenateStringArrays(args, disabledCommands);
		SpringApplication.run(App.class, fullArgs);
	}

	@Bean
	public PromptProvider myPromptProvider() {
		return () -> new AttributedString("shell:>", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
	}
}
