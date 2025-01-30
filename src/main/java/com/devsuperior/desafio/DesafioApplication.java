package com.devsuperior.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio.entities.Order;
import com.devsuperior.desafio.services.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			Order[] orders = {
		        new Order(1034, 150.00, 20.0),
		        new Order(2282, 800.00, 10.0),
		        new Order(1309, 95.90, 0.0)
		    };

		    for (Order order : orders) {
		        printOrder(order);
		    }
		}

		private void printOrder(Order order) {
			System.out.printf("Pedido código %d\n", order.getCode());
			System.out.printf("Valor total: R$ %.2f\n\n", orderService.total(order));
		}
	
}
