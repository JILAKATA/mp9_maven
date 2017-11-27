package jenkins.model;

import org.junit.Test;
import static org.junit.Assert.*;
public class TestPartIdStrategy {
	@Test
	public void testIdFromFileNameTest0() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals("cs", obj.idFromFilename("cs"));
	}
	@Test
	public void testIdFromFileNameTest1() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals("program", obj.idFromFilename("program"));
	}
	@Test
	public void testIdFromFileNameTest2() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals("a", obj.idFromFilename("a"));
	}
	@Test
	public void testIdFromFileNameTest3() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals("b", obj.idFromFilename("b"));
	}
	@Test
	public void testIdFromFileNameTest4() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals("", obj.idFromFilename(""));
	}
	@Test
	public void testIdFromFileNameTest5() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals("no", obj.idFromFilename("no"));
	}
	@Test
	public void testIdFromFileNameTest6() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals("1", obj.idFromFilename("1"));
	}	@Test
	public void testIdFromFileNameTest7() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals("3", obj.idFromFilename("3"));
	}	@Test
	public void testIdFromFileNameTest8() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals("yes", obj.idFromFilename("yes"));
	}	@Test
	public void testIdFromFileNameTest9() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals("na", obj.idFromFilename("na"));
	}
	public void testIdFromFileNameTest10() {
		IdStrategy.CaseSensitive obj = new IdStrategy.CaseSensitive();
		assertEquals("hello", obj.idFromFilename("hello"));
	}
}
