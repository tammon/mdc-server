/*
 * Copyright (c) 2015. Tammo Schwindt (Tammon) <dev@tammon.de>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * Created by tammschw on 07/06/15.
 */

$(function () {
    $('#wrong-form-input-alert').addClass('hidden');
    sweetAlert({
        title: $('#order-formInputError-heading')[0].outerHTML,
        text: $('#order-formInputError-message')[0].outerHTML + $('#wrong-form-input-errors')[0].outerHTML,
        html: true,
        type: 'warning'
    });
});