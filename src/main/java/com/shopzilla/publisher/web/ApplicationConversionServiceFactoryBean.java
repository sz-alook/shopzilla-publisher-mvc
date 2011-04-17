package com.shopzilla.publisher.web;

import com.shopzilla.publisher.domain.Category;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.roo.addon.web.mvc.controller.RooConversionService;
        
/**
 * A central place to register application Converters and Formatters. 
 */
@RooConversionService
public class ApplicationConversionServiceFactoryBean extends FormattingConversionServiceFactoryBean {

	@Override
	protected void installFormatters(FormatterRegistry registry) {
		super.installFormatters(registry);
		// Register application converters and formatters
	}
	

	public void installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(new CategoryConverter());
    }

	public void afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }

	static class CategoryConverter implements Converter<Category, String>  {
        public String convert(Category category) {
        return new StringBuilder().append(category.getId()).append(" ").append(category.getTitle()).toString();
        }
        
    }
}
