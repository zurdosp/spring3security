package br.com.css.cnpjsmartsearch.util;

import java.io.File;

import java.io.IOException;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;
import org.springframework.stereotype.Service;

@Service
public class CnpjSearchUtil {
	
	public void genJsonClasses(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName) 
			throws IOException {
		com.sun.codemodel.JCodeModel jcodeModel = new com.sun.codemodel.JCodeModel();

		GenerationConfig config = new DefaultGenerationConfig() {
			@Override
			public boolean isGenerateBuilders() {
				return true;
			}

			@Override
			public SourceType getSourceType() {
				return SourceType.JSON;
			}
		};

		SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
		mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

		jcodeModel.build(outputJavaClassDirectory);
	}
}
