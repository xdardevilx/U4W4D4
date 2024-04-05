package valerio.U4W4D4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import valerio.U4W4D4.entities.*;
import valerio.U4W4D4.repository.PizzaRepository;
import valerio.U4W4D4.repository.ToppingRepository;

@Component
public class OrdersRunner implements CommandLineRunner {

	@Autowired
	private PizzaRepository pizzaRepository;

	@Autowired
	private ToppingRepository toppingRepository;
	@Override
	public void run(String... args) throws Exception {
		Topping tomato = new Topping("Tomato", 24, 0.79);
		toppingRepository.save(tomato);


//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U4W4D4Application.class);
//		try {
//			Menu m = (Menu) ctx.getBean("menu");
//			m.printMenu();
//
//			Table t1 = (Table) ctx.getBean("Tavolo1");
//
//			Order o1 = new Order(4, t1);
//
//			o1.addItem(ctx.getBean("pizza_margherita", Pizza.class));
//			o1.addItem(ctx.getBean("hawaiian_pizza", Pizza.class));
//			o1.addItem(ctx.getBean("salami_pizza_xl", Pizza.class));
//			o1.addItem(ctx.getBean("lemonade", Drink.class));
//			o1.addItem(ctx.getBean("lemonade", Drink.class));
//			o1.addItem(ctx.getBean("wine", Drink.class));
//
//			System.out.println("DETTAGLI TAVOLO 1:");
//			o1.print();
//
//			System.out.println("CONTO TAVOLO 1");
//			System.out.println(o1.getTotal());
//		} catch (Exception ex) {
//			System.err.println(ex.getMessage());
//		} finally {
//			ctx.close();
//		}
	}
}
