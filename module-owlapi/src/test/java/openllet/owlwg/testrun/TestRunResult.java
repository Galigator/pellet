package openllet.owlwg.testrun;

import openllet.owlwg.runner.TestRunner;
import openllet.owlwg.testcase.TestCase;

/**
 * <p>
 * Title: Test Run Result
 * </p>
 * <p>
 * Description: Interface based on result ontology described at <a href="http://www.w3.org/2007/OWL/wiki/Test_Result_Format"
 * >http://www.w3.org/2007/OWL/wiki/Test_Result_Format</a>.
 * </p>
 * <p>
 * Copyright: Copyright &copy; 2009
 * </p>
 * <p>
 * Company: Clark & Parsia, LLC. <a href="http://clarkparsia.com/"/>http://clarkparsia.com/</a>
 * </p>
 *
 * @author Mike Smith &lt;msmith@clarkparsia.com&gt;
 */
public interface TestRunResult
{

	void accept(TestRunResultVisitor visitor);

	Throwable getCause();

	String getDetails();

	RunResultType getResultType();

	TestCase<?> getTestCase();

	TestRunner<?> getTestRunner();

	RunTestType getTestType();
}
