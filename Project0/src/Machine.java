
public class Machine{
	String name, ip;
	long memory, disks, vcpus;
	final long TOTAL_MEMORY, TOTAL_DISKS, TOTAL_VCPUS;
	
	Machine(String name, String ip, long mem, long disks, long vcpus){
		this.name = name;
		this.ip = ip;
		TOTAL_MEMORY = memory = mem; //memory = amount of RAM in GB
		TOTAL_DISKS = this.disks = disks;
		TOTAL_VCPUS = this.vcpus = vcpus;
	}
	
	public boolean canHost(Flavor flavor){
		return memory >= flavor.ram && disks >= flavor.disks && vcpus >= flavor.vcpus;
	}
}
