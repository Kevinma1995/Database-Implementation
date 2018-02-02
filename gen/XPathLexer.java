// Generated from /Users/mazhaochun/Desktop/milestone1/src/XPath.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NAME=15, NEWLINE=16, 
		STAR=17, DOT=18, PARENT=19, TEXT=20, AT=21, AND=22, OR=23, NOT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "NAME", "NEWLINE", "STAR", 
		"DOT", "PARENT", "TEXT", "AT", "AND", "OR", "NOT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc('", "')/'", "')//'", "'('", "')'", "'/'", "'//'", "'['", "']'", 
		"','", "'='", "'eq'", "'=='", "'is'", null, null, "'*'", "'.'", "'..'", 
		"'text()'", "'@'", "'and'", "'or'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NAME", "NEWLINE", "STAR", "DOT", "PARENT", "TEXT", 
		"AT", "AND", "OR", "NOT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\6\20[\n\20\r\20\16\20\\\3\21\5\21`\n\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\3\4\2C\\c|\2\177"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\3\63\3\2\2\2\58\3\2\2\2\7;\3\2\2\2\t?\3\2\2\2\13A\3\2"+
		"\2\2\rC\3\2\2\2\17E\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27N\3"+
		"\2\2\2\31P\3\2\2\2\33S\3\2\2\2\35V\3\2\2\2\37Z\3\2\2\2!_\3\2\2\2#c\3\2"+
		"\2\2%e\3\2\2\2\'g\3\2\2\2)j\3\2\2\2+q\3\2\2\2-s\3\2\2\2/w\3\2\2\2\61z"+
		"\3\2\2\2\63\64\7f\2\2\64\65\7q\2\2\65\66\7e\2\2\66\67\7*\2\2\67\4\3\2"+
		"\2\289\7+\2\29:\7\61\2\2:\6\3\2\2\2;<\7+\2\2<=\7\61\2\2=>\7\61\2\2>\b"+
		"\3\2\2\2?@\7*\2\2@\n\3\2\2\2AB\7+\2\2B\f\3\2\2\2CD\7\61\2\2D\16\3\2\2"+
		"\2EF\7\61\2\2FG\7\61\2\2G\20\3\2\2\2HI\7]\2\2I\22\3\2\2\2JK\7_\2\2K\24"+
		"\3\2\2\2LM\7.\2\2M\26\3\2\2\2NO\7?\2\2O\30\3\2\2\2PQ\7g\2\2QR\7s\2\2R"+
		"\32\3\2\2\2ST\7?\2\2TU\7?\2\2U\34\3\2\2\2VW\7k\2\2WX\7u\2\2X\36\3\2\2"+
		"\2Y[\t\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2] \3\2\2\2^`\7"+
		"\17\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\f\2\2b\"\3\2\2\2cd\7,\2\2d$"+
		"\3\2\2\2ef\7\60\2\2f&\3\2\2\2gh\7\60\2\2hi\7\60\2\2i(\3\2\2\2jk\7v\2\2"+
		"kl\7g\2\2lm\7z\2\2mn\7v\2\2no\7*\2\2op\7+\2\2p*\3\2\2\2qr\7B\2\2r,\3\2"+
		"\2\2st\7c\2\2tu\7p\2\2uv\7f\2\2v.\3\2\2\2wx\7q\2\2xy\7t\2\2y\60\3\2\2"+
		"\2z{\7p\2\2{|\7q\2\2|}\7v\2\2}\62\3\2\2\2\5\2\\_\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}