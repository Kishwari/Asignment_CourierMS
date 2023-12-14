import java.util.*;
class Courier {
	            private String name;
	            private double proximity; // Proximity to the shipment destination
	            private double loadCapacity; // Load capacity of the courier

	            public Courier(String name, double proximity, double loadCapacity) {
	                this.name = name;
	                this.proximity = proximity;
	                this.loadCapacity = loadCapacity;
	            }

	            // Getters for courier properties
	            public String getName() {
	                return name;
	            }

	            public double getProximity() {
	                return proximity;
	            }

	            public double getLoadCapacity() {
	                return loadCapacity;
	            }
	        }

	        class Shipment {
	            private String destination;
	            private double shipmentLoad;

	            public Shipment(String destination, double shipmentLoad) {
	                this.destination = destination;
	                this.shipmentLoad = shipmentLoad;
	            }

	            // Getters for shipment properties
	            public String getDestination() {
	                return destination;
	            }

	            public double getShipmentLoad() {
	                return shipmentLoad;
	            }
	        }

	        public class CourierAssignment {
	            public static void main(String[] args) {
	                // Sample list of couriers and shipments
	                List<Courier> couriers = new ArrayList<>();
	                couriers.add(new Courier("Courier A", 10.5, 100));
	                couriers.add(new Courier("Courier B", 15.2, 80));
	                couriers.add(new Courier("Courier C", 8.7, 120));

	                List<Shipment> shipments = new ArrayList<>();
	                shipments.add(new Shipment("Destination X", 70));
	                shipments.add(new Shipment("Destination Y", 90));

	                // Assign couriers to shipments based on criteria
	                for (Shipment shipment : shipments) {
	                    Courier selectedCourier = null;
	                    double minProximity = Double.MAX_VALUE;

	                    for (Courier courier : couriers) {
	                        // Criteria: Choose courier with closest proximity and sufficient load capacity
	                        if (courier.getProximity() < minProximity && courier.getLoadCapacity() >= shipment.getShipmentLoad()) {
	                            minProximity = courier.getProximity();
	                            selectedCourier = courier;
	                        }
	                    }

	                    if (selectedCourier != null) {
	                        System.out.println("Assigned " + selectedCourier.getName() + " to shipment to " + shipment.getDestination());
	                        // Remove the assigned courier to avoid assigning the same courier to multiple shipments
	                        couriers.remove(selectedCourier);
	                    } else {
	                        System.out.println("No available courier for shipment to " + shipment.getDestination());
	                    }
	                }
	            }
	        }
	        