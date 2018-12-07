package com.immutable;

public final class ImmutableSpaceship {

	private final String name;
	private final Destination destination;
	
	private ImmutableSpaceship(String name, Destination destination) {
		super();
		this.name = name;
		this.destination = new Destination(destination.getValue());
	}
	
	public Destination currentDestination() {
		return new Destination(destination.getValue());
	}
	
	public ImmutableSpaceship newDestinataion(Destination newDestination) {
		return new ImmutableSpaceship(this.name, newDestination);
	}
	
}
