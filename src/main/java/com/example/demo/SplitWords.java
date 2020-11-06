package com.example.demo;

import org.apache.beam.sdk.transforms.PTransform;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;

public class SplitWords extends PTransform<PCollection<String>, PCollection<String>> {

	@Override
	public PCollection<String> expand(PCollection<String> input) {
		// Convert line of text into individual lines
		PCollection<String> lines = input.apply(ParDo.of(new SplitWordsFn()));

		return lines;
	}

}
