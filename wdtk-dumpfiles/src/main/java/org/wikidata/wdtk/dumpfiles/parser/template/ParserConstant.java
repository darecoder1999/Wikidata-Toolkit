package org.wikidata.wdtk.dumpfiles.parser.template;

/*
 * #%L
 * Wikidata Toolkit Dump File Handling
 * %%
 * Copyright (C) 2014 Wikidata Toolkit Developers
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * 
 * @author Julian Mendez
 * 
 */
public interface ParserConstant {

	String OPENING_BRACES = "{{";
	String CLOSING_BRACES = "}}";
	String OPENING_BRACKETS = "[[";
	String CLOSING_BRACKETS = "]]";
	String EQUALS_SIGN = "=";
	String VERTICAL_BAR = "|";
	String UNDERSCORE = "_";
	String SPACE = " ";
	String COMMA = ",";
	String COLON = ":";
	String SEMICOLON = ";";

}
