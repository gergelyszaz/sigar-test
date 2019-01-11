import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import org.hyperic.sigar.Sigar;


public class SigarTest {
	
	@Before
	public void setup() {
		sigar = new Sigar();
	}
	
	@After
	public void tearDown() {
		sigar.close();
	}

	@Test
	public void testGetMem() throws Exception {
		sigar.getMem();
	}
	
	@Test
	public void testGetSwap() throws Exception {
		sigar.getSwap();
	}
	
	@Test
	public void testGetCpu() throws Exception {
		sigar.getCpu();
	}
	
	@Test
	public void testGetCpuInfoList() throws Exception {
		sigar.getCpuInfoList();
	}
	
	Sigar sigar;
}
