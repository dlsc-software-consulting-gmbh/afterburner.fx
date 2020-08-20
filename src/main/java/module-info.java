/*
 * #%L
 * afterburner.fx
 * %%
 * Copyright (C) 2013 - 2019 Adam Bien
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
import com.airhacks.afterburner.injection.PresenterFactory;

module afterburner.fx {
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;

    requires javax.inject;
    requires java.annotation;

    requires org.slf4j;

    exports com.airhacks.afterburner.configuration;
    exports com.airhacks.afterburner.injection;
    exports com.airhacks.afterburner.views;

    uses PresenterFactory;
}
