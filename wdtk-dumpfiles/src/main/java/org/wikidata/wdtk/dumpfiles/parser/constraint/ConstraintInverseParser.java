package org.wikidata.wdtk.dumpfiles.parser.constraint;

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

import org.wikidata.wdtk.datamodel.implementation.DataObjectFactoryImpl;
import org.wikidata.wdtk.datamodel.interfaces.PropertyIdValue;
import org.wikidata.wdtk.dumpfiles.constraint.ConstraintInverse;
import org.wikidata.wdtk.dumpfiles.parser.template.Template;

/**
 * 
 * @author Julian Mendez
 * 
 */

class ConstraintInverseParser implements ConstraintParser {

	public ConstraintInverseParser() {
	}

	public ConstraintInverse parse(Template template) {
		ConstraintInverse ret = null;
		String propertyStr = template.get(ConstraintParserConstant.P_PROPERTY);
		if (propertyStr != null) {
			DataObjectFactoryImpl factory = new DataObjectFactoryImpl();
			PropertyIdValue property = factory.getPropertyIdValue(propertyStr,
					ConstraintMainParser.DEFAULT_BASE_IRI);
			ret = new ConstraintInverse(property);
		}
		return ret;
	}

}
