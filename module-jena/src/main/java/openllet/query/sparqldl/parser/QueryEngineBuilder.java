package openllet.query.sparqldl.parser;

/**
 * Provide a parser.
 *
 * @since 2.6.0
 */
public interface QueryEngineBuilder
{
	static QueryParser getParser()
	{
		return new ARQParser();
	}
}
