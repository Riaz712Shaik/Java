import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InvoiceManupulation {
	public static void main(String[] args)

	{
		Invoice invoice1 = new Invoice(83, "Electric Sander", 07, 57.98);
		Invoice invoice2 = new Invoice(24, "Power saw", 18, 99.99);
		Invoice invoice3 = new Invoice(7, "Sledge hammer", 11, 21.50);
		Invoice invoice4 = new Invoice(77, "Hammer", 76, 11.99);
		Invoice invoice5 = new Invoice(39, "Lawn mower", 3, 79.50);
		Invoice invoice6 = new Invoice(68, "Screwdriver", 106, 6.99);
		Invoice invoice7 = new Invoice(56, "Jig saw", 21, 11.00);
		Invoice invoice8 = new Invoice(3, "Wrench", 34, 7.50);

		List<Invoice> IsInvoice = new ArrayList();
		IsInvoice.add(invoice1);
		IsInvoice.add(invoice2);
		IsInvoice.add(invoice3);
		IsInvoice.add(invoice4);
		IsInvoice.add(invoice5);
		IsInvoice.add(invoice6);
		IsInvoice.add(invoice7);
		IsInvoice.add(invoice8);

		System.out.println("Sorting invoice by part " + "description :\n");
		IsInvoice.stream()
		.sorted(Comparator.comparing(Invoice::getPartDescription))
		.forEach(p -> System.out.println(p + "\n"));
		System.out.println();
		System.out.println("Sorting invoice by price :\n");
		IsInvoice.stream().sorted(Comparator.comparingDouble(Invoice::getPricePerItem))
				.forEach(p -> System.out.println(p + "\n"));
		System.out.println();
		System.out.println("Sorting invoice by quantity and " + "map to part " + "description and quantity :");
		IsInvoice.stream().sorted(Comparator.comparing(Invoice::getQuantity))
				.map(i -> ((Invoice) i).getPartDescription() + " " + ((Invoice) i).getQuantity())
				.forEach(p -> System.out.println(p));
		System.out.println("\nSorting invoice by value and " + "map to part descritpion and " + "value:");
		IsInvoice.stream().sorted(Comparator.comparing(Invoice::getInvoiceAmount))
				.map(i -> ((Invoice) i).getPartDescription() + " " + ((Invoice) i).getInvoiceAmount())
				.forEach(p -> System.out.println(p));
		System.out.println();
		System.out.println("Values between 200 and 500 and " + "Sorting invoice by value:");
		IsInvoice.stream()
				.filter(i -> ((Invoice) i).getInvoiceAmount() >= 200 && ((Invoice) i).getInvoiceAmount() <= 500)
				.sorted(Comparator.comparing(Invoice::getInvoiceAmount))
				.map(i -> ((Invoice) i).getPartDescription() + " " + ((Invoice) i).getInvoiceAmount())
				.forEach(p -> System.out.println(p));
		
	}

}