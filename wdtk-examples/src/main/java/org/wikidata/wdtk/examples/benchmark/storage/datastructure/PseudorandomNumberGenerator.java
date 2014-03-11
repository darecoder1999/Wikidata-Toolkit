package org.wikidata.wdtk.examples.benchmark.storage.datastructure;

/*
 * #%L
 * Wikidata Toolkit Data Model
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
 * Pseudorandom number generator.
 * 
 * @author Julian Mendez
 * 
 */
public class PseudorandomNumberGenerator {

	int seed = 0x1234;

	public PseudorandomNumberGenerator() {
	}

	public PseudorandomNumberGenerator(int seed) {
		this.seed = seed;
	}

	/**
	 * Returns a boolean obtained using a pseudorandom number generator.
	 * 
	 * @return a boolean obtained using a pseudorandom number generator
	 * 
	 */
	public boolean getPseudorandomBoolean() {
		this.seed = (0x4650 * (this.seed & 0xFFFF)) + (this.seed >> 0x10);
		return ((this.seed & 1) == 1);
	}

}
